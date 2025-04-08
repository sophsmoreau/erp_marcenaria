import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int codigoPedido;
    private int data;
    private double valor;
    private String status;
    private Cliente cliente;
    private List<String> produtos = new ArrayList<>();

    public Pedido( Cliente cliente) {
        this.cliente = cliente;
    }

    public Pedido(int codigoPedido, int data, double valor, String status) {
        this.codigoPedido = codigoPedido;
        this.data = data;
        this.valor = valor;
        this.status = status;
    }

    public void addProduto(String produto) {
        produtos.add(produto);
    }

    public Cliente getCliente(){
        return cliente;
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public int getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }

    public String getStatus() {
        return status;
    }

    public double calcularTotal(){
        return 0;
    }
}
