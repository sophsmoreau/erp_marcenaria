package model;

import java.time.LocalDate;

public class Pedido {
    private int id;
    private int idOrcamento;
    private String status;
    private LocalDate dataPedido;

    public Pedido() {}

    public Pedido(int id, int idOrcamento, String status, LocalDate dataPedido) {
        this.id = id;
        this.idOrcamento = idOrcamento;
        this.status = status;
        this.dataPedido = dataPedido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdOrcamento() {
        return idOrcamento;
    }

    public void setIdOrcamento(int idOrcamento) {
        this.idOrcamento = idOrcamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }
}
