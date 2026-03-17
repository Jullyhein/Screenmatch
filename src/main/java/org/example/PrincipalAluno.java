package org.example;

import br.com.alura.screenmatch.modelo.AlunoMedia;

public class PrincipalAluno {
    public static void main(String[] args) {
        AlunoMedia mediaAluno = new AlunoMedia("Jullyen", 8.5, 7.8, 9.0);
        AlunoMedia mediaAluno2 = new AlunoMedia("Leandro", 7.6, 4.5, 7.5);

        System.out.println("Aluno 1: ");
        System.out.println("Nome "+ mediaAluno.getNome());
        System.out.println("Nota 1: "+ mediaAluno.getNota1());
        System.out.println("Nota 2: "+ mediaAluno.getNota2());
        System.out.println("Nota 3: "+ mediaAluno.getNota3());
        System.out.println("Média: "+ mediaAluno.calcularMedia());

        System.out.println("Aluno 2: ");
        System.out.println("Nota 1: "+ mediaAluno.getNota1());
        System.out.println("Nota 2: "+ mediaAluno.getNota2());
        System.out.println("Nota 3: "+ mediaAluno.getNota3());
        System.out.println("Média: "+ mediaAluno.calcularMedia());

    }
}
