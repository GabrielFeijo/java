import java.util.Scanner;

public class melhornota {
    public static void main(String[] args) { 
        int c;
        Double nota,melhor;
        String nome,melhoraluno;
        Scanner ler = new Scanner(System.in);

        c = 1;
        melhor = 0.0;
        melhoraluno = "";
        
        do{
         System.out.println("Qual nome do aluno ?");
          nome = ler.next();
          System.out.println("Qual foi a nota de " + nome + "?");
          nota = ler.nextDouble();
          if (nota > melhor ){
              melhor = nota;
              melhoraluno = nome;
              
          }
          System.out.println("Deseja adicionar outro aluno ? [1/2]");
          System.out.println("1 - SIM || 2 - NAO");
          c = ler.nextInt();

        }while (c == 1);
        
        System.out.println("O melhor aluno(a) foi " + melhoraluno );
        System.out.println("Com nota de " + melhor );


        ler.close();

    }
}
