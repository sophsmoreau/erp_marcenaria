package service;

import dao.MaterialDAO;
import model.Material;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class MaterialService {
    private MaterialDAO materialDAO;

    public MaterialService(Connection conn) {
        this.materialDAO = new MaterialDAO(conn);
    }

    public void registrar(Material m) throws SQLException {
        materialDAO.salvar(m);
    }

    public List<Material> listarTodos() throws SQLException {
        return materialDAO.listar();
    }
}

