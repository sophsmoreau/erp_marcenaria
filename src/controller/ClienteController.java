package controller;

import model.Cliente;
import service.ClienteService;

import java.sql.Connection;
import java.sql.SQLException;

public class ClienteController {
    private ClienteService clienteService;

    public ClienteController(Connection conn) {
        this.clienteService = new ClienteService(conn);
    }

    public void criarClienteViaRequisicao(/* parâmetros simulando input */) {
        Cliente c = new Cliente();
        c.setNome("João");
        c.setTelefone("119999999");
        c.setEmail("joao@email.com");
        c.setEndereco("Rua A, 123");

        try {
            clienteService.registrarNovoCliente(c);
            System.out.println("Cliente cadastrado com sucesso.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

