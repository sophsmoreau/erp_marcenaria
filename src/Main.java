public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Maria", "111.222.333-44", "(11) 9999-0000", "maria.xxx@xxx", "wdwcwc");
        
        boolean cpfValido = ClienteService.validarCPF(cliente.getCpfCnpj());
        System.out.println("CPF válido? " + cpfValido);

        Cliente Cliente = null;
        Pedido pedido = new Pedido(Cliente);
        pedido.addProduto("Mesa de Madeira");
        System.out.println("Pedido criado para: " + pedido.getCliente().getNome());
    }
}
