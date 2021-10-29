import java.util.Scanner;

public class ingressos {
    public static void main(String[] args) { 
       Scanner ler = new Scanner(System.in);
        
       int ingNormal,ingEstudante,ingAcessivel,ingTotal;
       double valorNormal,valorEstudante,valorAcessivel,valorTotal;

       System.out.println("Quantos ingressos do tipo Normal foram vendidos?");
       ingNormal = ler.nextInt();
       System.out.println("Quantos ingressos do tipo Estudante foram vendidos?");
       ingEstudante = ler.nextInt();
       System.out.println("Quantos ingressos do tipo Acessível foram vendidos?");
       ingAcessivel = ler.nextInt();

       ingTotal = ingNormal + ingEstudante + ingAcessivel;

       valorNormal = ingNormal * 100;
       valorEstudante = ingEstudante * 50;
       valorAcessivel = ingAcessivel * 30;
       valorTotal = valorNormal + valorEstudante + valorAcessivel;


       System.out.println("===================================");
       System.out.println("Ingresso Normal:    " + ingNormal);
       System.out.println("Ingresso Estudante: " + ingEstudante);
       System.out.println("Ingresso Acessível: " + ingAcessivel);
       System.out.println("Total de ingressos vendidos: " + ingTotal);
       System.out.println("===================================");
       System.out.println("Valor ingresso Normal:    R$" + valorNormal);
       System.out.println("Valor ingresso Estudante: R$" + valorEstudante);
       System.out.println("Valor ingresso Acessível: R$" + valorAcessivel);
       System.out.println("Valor total arrecadado:   R$" + valorTotal);
       System.out.println("===================================");

        ler.close();


    }
}
