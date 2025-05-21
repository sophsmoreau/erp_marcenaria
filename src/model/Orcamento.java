package model;

import java.util.Date;

public class Orcamento {
    private int id;
    private int clienteId;
    private Date dataCriacao;
    private String descricao;
    private double valorTotal;
    private String status;

    public Orcamento(int id, int clienteId, Date dataCriacao, String descricao, double valorTotal, String status) {
        this.id = id;
        this.clienteId = clienteId;
        this.dataCriacao = dataCriacao;
        this.descricao = descricao;
        this.valorTotal = valorTotal;
        this.status = status;
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

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
