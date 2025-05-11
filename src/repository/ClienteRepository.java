package repository;

import model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {
    private static ClienteRepository instancia;
    private final List<Cliente> clientes = new ArrayList<>();

    private ClienteRepository() {}

    public static ClienteRepository getInstance() {
        if (instancia == null) instancia = new ClienteRepository();
        return instancia;
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> listarClientes() {
        return clientes;
    }

    public Cliente buscarPorId(int id) {
        return clientes.stream()
                .filter(c -> c.getId() == id).findFirst().orElse(null);
    }
}
