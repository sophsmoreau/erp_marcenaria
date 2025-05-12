package service;

import model.Cliente;
import model.Pedido;
import model.Produto;
import repository.ClienteRepository;
import repository.PedidoRepository;
import repository.ProdutoRepository;

import java.util.Scanner;

public class PedidoService {
    private final PedidoRepository pedidoRepo = PedidoRepository.getInstance();
    private final ProdutoRepository produtoRepo = ProdutoRepository.getInstance();
    private final ClienteRepository clienteRepo = ClienteRepository.getInstance();

    public void realizarPedido(Scanner scanner) {
        System.out.print("ID do cliente: ");
        int idCliente = scanner.nextInt();
        Cliente cliente = clienteRepo.buscarPorId(idCliente);
        if (cliente == null) {
            System.out.println("Cliente não encontrado.");
            return;
        }

        System.out.println("Produtos disponíveis:");
        produtoRepo.listarProdutos().forEach(System.out::println);

        System.out.print("ID do produto: ");
        int idProduto = scanner.nextInt();
        Produto produto = produtoRepo.buscarPorId(idProduto);

        if (produto == null) {
            System.out.println("Produto não encontrado.");
            return;
        }

        System.out.print("Quantidade desejada: ");
        int quantidade = scanner.nextInt();

        if (produto.getQuantidade() < quantidade) {
            System.out.println("Estoque insuficiente.");
            return;
        }

        produto.setQuantidade(produto.getQuantidade() - quantidade);
        Pedido pedido = new Pedido(cliente, produto, quantidade);
        pedidoRepo.adicionarPedido(pedido);

        System.out.println("Pedido realizado com sucesso.");
    }

    public void consultarPedidos() {
        pedidoRepo.listarPedidos().forEach(System.out::println);
    }
}
