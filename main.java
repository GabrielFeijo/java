
import java.util.Scanner;

public class main {
 public static void main(String[] args) {   
        int idade;
        String maior; 
         Scanner ler = new Scanner(System.in);

        System.out.println("Digite sua idade ");
        idade = ler.nextInt();

        if(idade > 18){
          maior = "Você é de maior";
        }else{
            maior = "Você é de menor";
        }

        System.out.println(idade);
        System.out.println(maior);
    }
}
