package service;

import model.ItemPedido;
import model.Pedido;

import java.util.List;

public class PedidoService {
    public void registrarPedido(Pedido pedido) {
        // Calcula total, valida cliente e estoque
    }

    public double calcularTotal(List<ItemPedido> itens) {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getPrecoUnitario() * item.getQuantidade();
        }
        return total;
    }
}
