
import java.util.Scanner;

public class kitnet {
 public static void main(String[] args) {   
       
        Scanner ler = new Scanner(System.in);

        int[] pessoas = new int[6];
        double[] aluguel = new double[6];
        final double VALOR_ALUGUEL = 800.00;
        final double ACRESCIMO = 100.00;
        int moradores = 0;
        int kitnetsDesocupados = 0;
        int kitnetsOcupados;
        double media;

        for(int i = 0; i < pessoas.length;i++){
            while (true){
                System.out.printf("Informe a quantidade de moradores do %dº Kitnet: \n", (i+1));
                pessoas[i] = ler.nextInt();
                if (pessoas[i] <0 || pessoas[i] > 3){
                    System.out.println();
                    System.out.println("Informe um valor entre 0 e 3");
                    System.out.println();
                    continue;
                }
                break;
            }
            moradores+=pessoas[i];
            if (pessoas[i] == 0){
                kitnetsDesocupados++;
            }
        
            switch (pessoas[i]){
                case 0:
                aluguel[i] = 0;
                break;
                case 1:
                aluguel[i] = VALOR_ALUGUEL;
                break;
                default:
                aluguel[i] = VALOR_ALUGUEL + ((pessoas[i] - 1 )*ACRESCIMO);
            }
           
            
        }
        kitnetsOcupados = pessoas.length - kitnetsDesocupados;
        if (kitnetsOcupados == 0){
            media = 0;
        }else{
            media = moradores/kitnetsOcupados;
        }
       


        System.out.println("=========================================================");
        System.out.println("Quantidade de Kitnets desocupados: " + kitnetsDesocupados);
        System.out.println("Média de Moradores por Kitnets:    " + media);
        for(int i = 0; i < pessoas.length;i++){
            System.out.printf("Valor do aluguel do %dº Kitnet: R$%.2f \n", (i+1), aluguel[i]);
        }
        System.out.println("=========================================================");

        System.out.println("Moradores " + moradores);
        System.out.println("Ocupados" + kitnetsOcupados);

        ler.close();
    }
}
