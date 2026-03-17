package org.example;

import br.com.alura.screenmatch.modelo.Filme;

public class PrincipalFilmes {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("Um amor pra recordar");
        meuFilme.setAnoDeLancamento (1990);
        meuFilme.setDuracaoEmMinutos(60);
        meuFilme.exibeFichaTecnica();
        meuFilme.avalicao(9);
        meuFilme.avalicao(10);
        meuFilme.avalicao(6);
        //System.out.println(meuFilme.totalDeAvaliacao);
        // Como é privado temos que PEGAR o que é preciso.
        System.out.println("Total Avaliações: " +meuFilme.getTotalDeAvaliacao());
        System.out.println(meuFilme.getSomaDeAvaliacao());

        System.out.println("A média é de: " + meuFilme.getTotalDeAvaliacao());

    }
}
