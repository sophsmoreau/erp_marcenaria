package repository;

import model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {
    private static ProdutoRepository instancia;
    private final List<Produto> produtos = new ArrayList<>();

    private ProdutoRepository() {
        // Produtos padrão
        produtos.add(new Produto("Mesa", 10));
    }

    public static ProdutoRepository getInstance() {
        if (instancia == null) instancia = new ProdutoRepository();
        return instancia;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> listarProdutos() {
        return produtos;
    }

    public Produto buscarPorId(int id) {
        return produtos.stream()
                .filter(p -> p.getId() == id).findFirst().orElse(null);
    }
}
