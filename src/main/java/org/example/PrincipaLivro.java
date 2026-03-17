package org.example;

import br.com.alura.screenmatch.modelo.Livro;

public class PrincipaLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.setTitulo("Assim que acaba");
        livro1.setAutor("Colleeen hoover");

        Livro livro2 = new Livro();
        livro2.setAutor("Bell Hooks");
        livro2.setTitulo("E eu não sou uma mulher?");

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();

    }


}
