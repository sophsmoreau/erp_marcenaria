package br.com.marcenaria.main;

import br.com.marcenaria.config.Conexao;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try (Connection conn = Conexao.getConnection()) {
            if (conn != null) {
                System.out.println("Conexão com o banco estabelecida com sucesso!");
            } else {
                System.out.println("Conexão retornou nula.");
            }
        } catch (SQLException e) {
            System.out.println("Erro SQL ao conectar: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
    }
}
