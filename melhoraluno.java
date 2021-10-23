import java.util.Scanner;

public class melhoraluno {
    public static void main(String[] args) { 
        int n1,nmaior,s;
        

        Scanner ler = new Scanner(System.in);
         nmaior = 0;
       
        do{
            System.out.println("Digite um valor");
            n1 = ler.nextInt();
            if (n1 > nmaior){
                nmaior = n1;
            }
            System.out.println("Deseja continuar? [1/2]");
            System.out.println("1 - SIM || 2 - NAO ");
            s = ler.nextInt();
        }while (s == 1); 
        System.out.println("O maior valor digitado foi: " + nmaior);
        
        ler.close();
            
       
       
    }
}
