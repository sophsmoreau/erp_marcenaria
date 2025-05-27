package br.com.marcenaria.controller;


import br.com.marcenaria.model.Pedido;
import br.com.marcenaria.service.PedidoService;

public class PedidoController {
    private PedidoService service = new PedidoService();

    public void registrarPedido(Pedido pedido) {
        service.registrarPedido(pedido);
    }
}
