import java.util.Scanner;

public class duracao_viagem {
    public static void main(String[] args) { 
        Scanner ler = new Scanner(System.in);
        
        double numeroDias,numeroHoras,totalHoras;

        System.out.print("Quantos dias duraram a viagem? ");
        numeroDias = ler.nextDouble();
        System.out.print("Quantas horas duraram a viagem? ");
        numeroHoras = ler.nextDouble();

        totalHoras = (numeroDias * 24) + numeroHoras;

        System.out.print("O total foi de " + totalHoras + " horas.");
       

        ler.close();

    }
}
