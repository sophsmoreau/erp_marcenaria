package br.com.marcenaria.util;


import br.com.marcenaria.model.Cliente;
import br.com.marcenaria.model.Pedido;
import br.com.marcenaria.model.Produto;

import java.io.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CsvUtil {
    public static void exportarClientes(List<Cliente> clientes, String caminhoArquivo) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            writer.write("ID,Nome,CPF_CNPJ,Telefone,Email,Endereco\n");
            for (Cliente c : clientes) {
                writer.write(String.format("%d,%s,%s,%s,%s,%s\n",
                        c.getId(), c.getNome(), c.getCpfCnpj(), c.getTelefone(), c.getEmail(), c.getEndereco()));
            }
        }
    }

    public static List<Cliente> importarClientes(String caminhoArquivo) throws IOException {
        List<Cliente> clientes = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo))) {
            reader.readLine(); // cabeçalho
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] campos = linha.split(",");
                Cliente cliente = new Cliente(0, campos[1], campos[2], campos[3], campos[4], campos[5]);
                clientes.add(cliente);
            }
        }
        return clientes;
    }

    public static void exportarProdutos(List<Produto> produtos, String caminhoArquivo) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            writer.write("ID,Nome,Descricao,PrecoUnitario,Estoque\n");
            for (Produto p : produtos) {
                writer.write(String.format("%d,%s,%s,%.2f,%d\n",
                        p.getId(), p.getNome(), p.getDescricao(), p.getPreco(), p.getEstoque()));
            }
        }
    }

    public static void exportarRelatorioFinanceiro(List<Pedido> pedidos, String caminhoArquivo) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            writer.write("ID_Pedido,Data,ClienteID,Total\n");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            for (Pedido p : pedidos) {
                writer.write(String.format("%d,%s,%d,%.2f\n",
                        p.getId(), p.getData().format(formatter), p.getClienteId(), p.getTotal()));
            }
        }
    }
}
