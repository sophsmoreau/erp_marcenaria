package principal;


import menu.MenuCliente;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tipoUsuario;

        System.out.println("-----BEM-VINDO A MARCENARIA DOMÍNIO-----");
        System.out.print("Você é 'cliente' ou 'gerente'? ");
        tipoUsuario = scanner.nextLine().trim().toLowerCase();

        switch (tipoUsuario) {
            case "cliente":
                MenuCliente.exibirMenu();
                break;
            case "gerente":
               // MenuGerente.exibirMenu();
                break;
            default:
                System.out.println("Tipo de usuário inválido.");
        }
    }
    }
}
