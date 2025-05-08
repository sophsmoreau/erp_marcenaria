package model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private static int contador = 1;
    private final int id;
    private Cliente cliente;
    private Produto produto;
    private int quantidade;

    public Pedido(Cliente cliente, Produto produto, int quantidade) {
        this.id = contador++;
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public int getId(){
        return id;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public Produto getProduto(){
        return produto;
    }

    public int getQuantidade(){
        return quantidade;
    }

    @Override
    public String toString() {
        return "Pedido ID: " + id +
                ", Cliente: " + cliente.getNome() +
                ", Produto: " + produto.getNome() +
                ", Quantidade: " + quantidade;
    }
}
