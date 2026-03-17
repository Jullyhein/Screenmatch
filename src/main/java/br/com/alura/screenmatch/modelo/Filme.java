package br.com.alura.screenmatch.modelo;

public class Filme {
       private String nome;
       private int anoDeLancamento;
       private boolean inclusoNoPlano;
       private int somaDeAvaliacao;
       // Não me deixar mudar nada, apenas visualizar oq eu tem no totalDeAvaliacao
       private int totalDeAvaliacao;
       private int duracaoEmMinutos;

       public int getTotalDeAvaliacao(){
              return totalDeAvaliacao;
       }

       public void setNome(String nome){
              this.nome = nome;
       }

       public void setAnoDeLancamento(int anoDeLancamento){
              this.anoDeLancamento = anoDeLancamento;
       }

       public void setInclusoNoPlano(boolean inclusoNoPlano){
              this.inclusoNoPlano = inclusoNoPlano;
       }

       public void setSomaDeAvaliacao(int somaDeAvaliacao){
              this.somaDeAvaliacao = somaDeAvaliacao;
       }

       public void setDuracaoEmMinutos(int duracaoEmMinutos){
              this.duracaoEmMinutos = duracaoEmMinutos;
       }

       public void setTotalDeAvaliacao(int totalDeAvaliacao){
              this.totalDeAvaliacao = totalDeAvaliacao;
       }

       public String getNome(){
              return nome;
       }

       public int getAnoDeLancamento(){
              return anoDeLancamento;
       }

       public boolean getInclusoNoPlano(){
              return inclusoNoPlano;
       }

       public int getSomaDeAvaliacao(){
              return somaDeAvaliacao;
       }

       public int getDuracaoEmMinutos(){
              return duracaoEmMinutos;
       }

       public void exibeFichaTecnica(){
              System.out.println("nome do filme " + nome);
              System.out.println("Ano de lançamento: " + anoDeLancamento);
       }

       public void avalicao(double nota){
              somaDeAvaliacao += nota;
              totalDeAvaliacao++;
       }
       double mediaDasAvaliacoes(){
              return somaDeAvaliacao / totalDeAvaliacao;
       }
}
