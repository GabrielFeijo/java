
import java.util.Scanner;

public class idade {

    static void verif(int x, int y) {
        System.out.println("A sua idade em " + x + " é igual a" );
        System.out.println(x-y );

      }
    public static void main(String[] args) { 
        int atual,nasc;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o ano atual");
        atual = ler.nextInt();
        System.out.println("Digite o ano do seu nascimento");
        nasc = ler.nextInt();

        verif(atual,nasc);

       ler.close();
   
    } 
}
