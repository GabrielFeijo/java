import java.util.Scanner;

public class maiusculo {
    public static void main(String[] args) { 
      String nome;
     
   

        Scanner ler = new Scanner(System.in);
        System.out.println("Escreva seu nome");
        nome = ler.next(); 

        System.out.println("Seu nome maiusculo " + nome.toUpperCase());
        System.out.println("Seu nome minusculo " + nome.toLowerCase());
        System.out.println("Comprimento do seu nome " + nome.length());
       

        ler.close();


    }
}
