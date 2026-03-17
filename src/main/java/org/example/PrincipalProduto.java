package org.example;

import br.com.alura.screenmatch.modelo.Produto;

public class PrincipalProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Celular", 2000.0);


        System.out.println("nome do produto: " +produto.getNome());
        System.out.println("Preço do celular: " +produto.getPreco());
        produto.aplicarDesconto(15);
        System.out.println("novo preço gerado: " + produto.getPreco());
    }
}
