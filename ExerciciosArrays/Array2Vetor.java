package ExerciciosArrays;

import java.util.Scanner;

public class Array2Vetor {

	public static void main(String[] args) {
		int x,somaPar=0, somaImpar=0, QntImpar=0;
		int[] numero = new int[6];
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<6;x++)
		{
			System.out.println("\nDigite os valores do vetor: ");
			numero[x] = leia.nextInt();
			
			if(numero[x]%2==0)
			{
				somaPar+=numero[x];
		
			}
			else
			{
				somaImpar+=numero[x];
				QntImpar++;
			}
		}
		
		for (x=0;x<6;x++) {
			if (numero[x] %2==0) {
			System.out.println("Os numeros pares s�o " +numero[x]);
		}
		}
		
		System.out.println("\nA soma dos Pares �: "+somaPar);
		System.out.println("\n A soma dos impares � "+somaImpar);
		System.out.println("\nA quantidade de impares � "+QntImpar);
		

	}

}
