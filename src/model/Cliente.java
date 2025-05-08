package model;

public class Cliente {
    private static int contador = 1;
    private final int id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String endereco;

    public Cliente(String nome, String cpf, String telefone, String email, String endereco) {
        this.id = contador++;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }


    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Cliente ID: " + id +
                ", Nome: " + nome +
                ", CPF: " + cpf +
                ", Telefone: " + telefone +
                ", Email: " + email +
                ", Endereço: " + endereco;
    }
}