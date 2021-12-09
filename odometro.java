
public class odometro{
	public static void main(String[] args) {
		int[] vetor = {89400, 89800, 99100, 99500, 900, 1500, 2100, 2200};
		int[] km = new int[7];
		String[] dias = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"};
	    double media = 0;
	    
	    System.out.println("==================================================================");
	    System.out.println("Quilômetros percorrida em cada dia da semana.");  
	    System.out.println();
	    for (int i= 0; i<dias.length;i++){
	        if (i == 3){
	            km[i] = (99999-vetor[i])+vetor[i+1];
	        }else{
	          km[i] = vetor[i+1]-vetor[i];
	        }
	        
	        System.out.println(dias[i] +": \t"+ km[i] + "Km");
	        media = media + km[i];

	    }
	    media = media/7;
	    System.out.println("------------------------------------------------------------------");
	    System.out.printf("Média de quilômetros percorridos: %.2fKm \n",media );
	    System.out.println("------------------------------------------------------------------");
	    System.out.println("Dias da semana em que foi percorrido quilômetros acima da média");
	    System.out.println();
	    for (int i= 0; i<km.length;i++){
	        if(km[i] > media){
	            System.out.println(dias[i]);
	        }
	    }
	    System.out.println("==================================================================");
	    
	    
	}
	
	
}


