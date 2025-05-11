package service;

import model.Cliente;
import repository.ClienteRepository;

import java.util.Scanner;

public class ClienteService {
    private final ClienteRepository clienteRepo = ClienteRepository.getInstance();

    public void cadastrarCliente(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereço = scanner.nextLine();

        Cliente cliente = new Cliente(nome, cpf, telefone, email, endereço);
        clienteRepo.adicionarCliente(cliente);

        System.out.println("Cliente cadastrado com sucesso!");
    }
}