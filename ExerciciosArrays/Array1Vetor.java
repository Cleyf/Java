package ExerciciosArrays;

import java.util.Scanner;

public class Array1Vetor {

	public static void main(String[] args) {
		int x, somador;
		int[] numero = new int [6];
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<6;x++) 
		{
			System.out.println("Entre com os valores: ");
			numero[x] = leia.nextInt();
		}
		somador=numero[0]+numero[1]+numero[5];
		System.out.println("\nA soma das posições do vetor é: "+somador);
		
		for(x=0;x<6;x++)
		{
			numero[4]=100;
			System.out.println("\nOs valores do vetor na ordem: "+numero[x]);
		}

	}

}

