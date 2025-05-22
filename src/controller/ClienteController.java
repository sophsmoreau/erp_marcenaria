package controller;

import model.Cliente;
import service.ClienteService;

import java.util.List;

public class ClienteController {
    private ClienteService service = new ClienteService();

    public void criarCliente(Cliente cliente) {
        service.salvar(cliente);
    }

    public List<Cliente> listarClientes() {
        return service.listarTodos();
    }
}

