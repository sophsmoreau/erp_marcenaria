package menu;

import service.ClienteService;
import service.PedidoService;

import java.util.Scanner;

public class MenuCliente {
    public static void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        ClienteService clienteService = new ClienteService();
        PedidoService pedidoService = new PedidoService();

        int opcao;

        do {
            System.out.println("\n--- MENU CLIENTE ---");
            System.out.println("1. Cadastrar-se");
            System.out.println("2. Realizar pedido");
            System.out.println("3. Consultar pedidos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    clienteService.cadastrarCliente(scanner);
                    break;
                case 2:
                    pedidoService.realizarPedido(scanner);
                    break;
                case 3:
                    pedidoService.consultarPedidos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }
}
