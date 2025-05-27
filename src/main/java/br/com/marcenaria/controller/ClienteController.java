package br.com.marcenaria.controller;


import br.com.marcenaria.model.Cliente;
import br.com.marcenaria.service.ClienteService;

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

