package org.example;

import br.com.alura.screenmatch.modelo.IdadePessoa;

public class PrincipalIdade {
    public static void main(String[] args) {
        IdadePessoa pessoaidade = new IdadePessoa();

        pessoaidade.setNome("Jully");
        pessoaidade.setIdade(19);
        System.out.println("A "+ pessoaidade.getNome() + " tem " + pessoaidade.getIdade() + " anos");

        pessoaidade.verificarIdade(pessoaidade.getIdade());

    }
}
