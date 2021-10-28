import java.util.Scanner;

public class salario_porcetagem {
  
    public static void main(String[] args) { 
        double valor,porce,total,novo;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor do seu salário.");
        valor = ler.nextDouble();
        System.out.println("Digite a porcetagem de desconto.");
        porce = ler.nextDouble();

        total = valor*(porce/100);
        novo = valor - total;

        
        System.out.printf("O valor de " + porce + " porcento de seu salário é %.2f.%n", total );
        System.out.printf("O salário no valor de " + valor + "  -  %.2f.%n" , total );
        System.out.printf("É igual a %.2f.%n" , novo);
        
        ler.close();


    }
}
