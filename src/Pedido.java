import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<String> produtos = new ArrayList<>();

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addProduto(String produto) {
        produtos.add(produto);
    }

    public Cliente getCliente() { return cliente; }
}
