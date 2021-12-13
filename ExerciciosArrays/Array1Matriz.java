package ExerciciosArrays;

import java.util.Scanner;

public class Array1Matriz {

	public static void main(String[] args) {
		int [][]valor = new int[3][3];
		int linha, coluna, qntMaior10=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				System.out.println("\nEntre com os valores da Matriz: ");
				valor[linha][coluna]= leia.nextInt();
				if (valor[linha][coluna]>10)
				{
					qntMaior10++;
				}
			}
		}

		
		System.out.println("A quantidade de numeros maiores que 10 é de: "+qntMaior10);
		}
	}


