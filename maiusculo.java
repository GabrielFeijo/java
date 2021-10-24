import java.util.Scanner;

public class maiusculo {
    public static void main(String[] args) { 
      String nome;
      char[] ch = new char[1];  


        Scanner ler = new Scanner(System.in);
        System.out.println("Escreva seu nome");
        nome = ler.next();

        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.length());
        System.out.println(nome.getChars(1, 1, ch,0);

        ler.close();


    }
}
