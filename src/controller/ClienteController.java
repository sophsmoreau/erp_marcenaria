package controller;


import model.Cliente;
import service.ClienteService;

import java.util.List;

public class ClienteController {
    private ClienteService clienteService = new ClienteService();

    public void criarCliente(Cliente cliente) {
        clienteService.cadastrarCliente(cliente);
    }

    public Cliente buscarCliente(int id) {
        return clienteService.obterCliente(id);
    }

    public List<Cliente> listarClientes() {
        return clienteService.listarClientes();
    }

    public void atualizarCliente(Cliente cliente) {
        clienteService.atualizarCliente(cliente);
    }

    public void deletarCliente(int id) {
        clienteService.removerCliente(id);
    }
}

