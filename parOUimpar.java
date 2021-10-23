import java.util.Scanner;

public class parOUimpar {
    public static void main(String[] args) { 
       int valor;

       Scanner ler = new Scanner(System.in);

       System.out.println("Digite um número para saber se é Par ou Impar:");
       valor = ler.nextInt();

       if (valor%2 == 0){
         System.out.println("O número "+ valor +" é um número PAR");
       }else{
        System.out.println("O número "+ valor +" é um número IMPAR");
       }
       ler.close();
    }

}
