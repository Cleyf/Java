package ExerciciosRepeticao;

import java.util.Scanner;

public class ForParImpar {

	public static void main(String[] args) {
		int x, num,numPar=0,numImpar=0;
		Scanner leia = new Scanner(System.in);
		
		for (x=0;x<=10;x++) {
			System.out.println("\nDigite um número: ");
			num = leia.nextInt();
			if (x%2==0) {
				numPar+=1;
			
			}else {
				numImpar+=1;
			
			}
		}
		System.out.println("\nO total de pares é"+numPar);
		System.out.println("\nO total de impares é: "+numImpar);

	}

}
