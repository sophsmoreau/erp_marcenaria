public class Cliente {
    private String nome;
    private String cpfCnpj;
    private String telefone;
    private String email;
    private String endereco;

    public Cliente(String nome, String cpfCnpj, String telefone, String email, String endereco) {
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
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
}