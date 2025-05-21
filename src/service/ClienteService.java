package service;

import dao.ClienteDAO;
import model.Cliente;

import java.util.List;

public class ClienteService {
    private ClienteDAO clienteDAO = new ClienteDAO();

    public void cadastrarCliente(Cliente cliente) {
        if (cliente.getNome() == null || cliente.getNome().isEmpty())
            throw new IllegalArgumentException("Nome obrigatório");
        clienteDAO.salvar(cliente);
    }

    public Cliente obterCliente(int id) {
        return clienteDAO.buscarPorId(id);
    }

    public List<Cliente> listarClientes() {
        return clienteDAO.listarTodos();
    }

    public void atualizarCliente(Cliente cliente) {
        if (cliente.getId() <= 0) throw new IllegalArgumentException("ID inválido");
        clienteDAO.atualizar(cliente);
    }

    public void removerCliente(int id) {
        if (id <= 0) throw new IllegalArgumentException("ID inválido");
        clienteDAO.deletar(id);
    }
}



