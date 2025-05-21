package model;

public class Estoque {
    private int id;
    private int idMaterial;
    private int quantidade;

    public Estoque() {}

    public Estoque(int id, int idMaterial, int quantidade) {
        this.id = id;
        this.idMaterial = idMaterial;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
