package controller;

import model.Produto;
import service.ProdutoService;

public class ProdutoController {
    private ProdutoService service = new ProdutoService();

    public void criarProduto(Produto produto) {
        service.salvar(produto);
    }

    public void atualizarEstoque(Produto produto, int quantidadeVendida) {
        service.atualizarEstoque(produto, quantidadeVendida);
    }
}
