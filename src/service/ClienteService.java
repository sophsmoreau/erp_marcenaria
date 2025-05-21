package service;

import dao.ClienteDAO;
import model.Cliente;

import java.sql.Connection;
import java.sql.SQLException;

public class ClienteService {
    private ClienteDAO clienteDAO;

    public ClienteService(Connection conn) {
        this.clienteDAO = new ClienteDAO(conn);
    }

    public void registrarNovoCliente(Cliente cliente) throws SQLException {
        // validar dados aqui
        clienteDAO.salvar(cliente);
    }
}

