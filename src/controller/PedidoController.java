package controller;

import model.Pedido;
import service.PedidoService;

public class PedidoController {
    private PedidoService service = new PedidoService();

    public void registrarPedido(Pedido pedido) {
        service.registrarPedido(pedido);
    }
}
