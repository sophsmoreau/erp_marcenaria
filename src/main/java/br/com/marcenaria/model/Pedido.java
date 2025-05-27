package br.com.marcenaria.model;

import java.time.LocalDate;
import java.util.List;

public class Pedido {
    private int id;
    private int clienteId;
    private LocalDate data;
    private double total;
    private List<ItemPedido> itens;

    public Pedido(){}

    public Pedido(int id, int clienteId, LocalDate data, double total, List<ItemPedido> itens) {
        this.id = id;
        this.clienteId = clienteId;
        this.data = data;
        this.total = total;
        this.itens = itens;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }
}
