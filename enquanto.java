import java.util.Scanner;

public class enquanto {
    public static void main(String[] args) { 
      int c,i;
 
      Scanner ler = new Scanner(System.in);

      c = 0;
      System.out.println();
      while (c<11){
          System.out.print(c + ".. ");
          c++;
      }
      System.out.println();
      
      System.out.println("Escreva um número para finalizar a contagem.");
      i = ler.nextInt();
       for (c = 0; c <= i; c++) {
        System.out.print(c + ".. ");
       }
       System.out.println();
       System.out.println("Escreva um número para finalizar a do...while.");
       i = ler.nextInt();
       c = 0;
       do{
        System.out.print(c + ".. "); 
        c++;
       }while (c<=i);

       ler.close();
    }
}
