package repository;

import model.Pedido;

import java.util.ArrayList;
import java.util.List;

public class PedidoRepository {
    private static PedidoRepository instancia;
    private final List<Pedido> pedidos = new ArrayList<>();

    private PedidoRepository() {}

    public static PedidoRepository getInstance() {
        if (instancia == null) instancia = new PedidoRepository();
        return instancia;
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido> listarPedidos() {
        return pedidos;
    }
}
