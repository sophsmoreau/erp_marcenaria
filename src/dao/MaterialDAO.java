package dao;

import model.Material;
import java.sql.*;
import java.util.*;

public class MaterialDAO {
    private Connection conn;

    public MaterialDAO(Connection conn) {
        this.conn = conn;
    }

    public void salvar(Material m) throws SQLException {
        String sql = "INSERT INTO materiais (nome, tipo, unidade_medida, custo_unitario) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, m.getNome());
        stmt.setString(2, m.getTipo());
        stmt.setString(3, m.getUnidadeMedida());
        stmt.setDouble(4, m.getCustoUnitario());
        stmt.executeUpdate();
    }

    public List<Material> listar() throws SQLException {
        List<Material> lista = new ArrayList<>();
        String sql = "SELECT * FROM materiais";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            Material m = new Material();
            m.setId(rs.getInt("id"));
            m.setNome(rs.getString("nome"));
            m.setTipo(rs.getString("tipo"));
            m.setUnidadeMedida(rs.getString("unidade_medida"));
            m.setCustoUnitario(rs.getDouble("custo_unitario"));
            lista.add(m);
        }

        return lista;
    }

    // Métodos: buscarPorId, atualizar, excluir podem ser adicionados conforme necessidade
}

