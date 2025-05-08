package model;

public class Produto {
    private static int contador = 1;
    private final int id;
    private String nome;
    private int quantidade;

    public Produto(String nome, int quantidade) {
        this.id = contador++;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public int getId() { return id; }

    public String getNome() { return nome; }

    public int getQuantidade() { return quantidade; }

    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    @Override
    public String toString() {
        return "Produto ID: " + id + ", Nome: " + nome + ", Quantidade: " + quantidade;
    }
}
