package br.com.marcenaria.controller;


import br.com.marcenaria.model.Produto;
import br.com.marcenaria.service.ProdutoService;

public class ProdutoController {
    private ProdutoService service = new ProdutoService();

    public void criarProduto(Produto produto) {
        service.salvar(produto);
    }

    public void atualizarEstoque(Produto produto, int quantidadeVendida) {
        service.atualizarEstoque(produto, quantidadeVendida);
    }
}
