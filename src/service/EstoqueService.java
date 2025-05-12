package service;

import repository.ProdutoRepository;

public class EstoqueService {
    private final ProdutoRepository produtoRepo = ProdutoRepository.getInstance();

    public void exibirEstoque() {
        System.out.println("--- ESTOQUE ---");
        produtoRepo.listarProdutos().forEach(System.out::println);
    }
}
