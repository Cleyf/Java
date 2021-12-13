package ExerciciosArrays;

import java.util.Scanner;

public class Array2Matriz {

	public static void main(String[] args) {
		double [][]M1 = new double[2][2];
		double [][]M2 = new double[2][2];
		int linha, coluna, escolha;
		final double ConsM1=12, ConsM2=20;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha=0;linha<2;linha++)
		{
			for(coluna=0;coluna<2;coluna++)
			{
				System.out.println("Digite os valores da primeira Matriz");
				M1[linha][coluna]= leia.nextInt();
				System.out.println("Digite os valores da segunda matriz Matriz");
				M2[linha][coluna]= leia.nextInt();
			}
		}
		System.out.println("\n 1 Somar as duas Matrizes");
		System.out.println("\n 2 Subtrair a primeira matriz da Segunda");
		System.out.println("\n 3 Adicione uma constante nas matrizes");
		System.out.println("\n 4 Imprimir as matrizes");
		escolha = leia.nextInt();
		
		if (escolha==1)
		{
			double[][] M3 = new double[2][2];
			for(linha=0;linha<2;linha++)
			{
				for(coluna=0;coluna<2;coluna++)
				{
					M3[linha][coluna]=M1[linha][coluna]+M2[linha][coluna];
					System.out.println("\n"+M3[linha][coluna]);
				}
			}
		}
		
		else if (escolha==2)
		{
			double[][] M3 = new double[2][2];
			for(linha=0;linha<2;linha++)
			{
				for(coluna=0;coluna<2;coluna++)
				{
					M3[linha][coluna]=M1[linha][coluna]-M2[linha][coluna];
					System.out.println("\n"+M3[linha][coluna]);
				}
			}
		}
		
		else if (escolha==3)
		{
			for( linha=0;linha<2;linha++)
			{
				for( coluna=0;coluna<2;coluna++)
				{
			M1[linha][coluna]+=ConsM1;
		
			M2[linha][coluna]+=ConsM2;
				}
			}
			for (linha=0;linha<2;linha++)
			{
				for (coluna=0;coluna<2;coluna++)
				{
					System.out.println("\n " +M1[linha][coluna]);
				}
			}
			for (linha=0;linha<2;linha++)
			{
				for (coluna=0;coluna<2;coluna++)
				{
					System.out.println("\n " +M2[linha][coluna]);
				}
			}
			
			
		}
		else if (escolha==4) 
		{
			for (linha=0;linha<2;linha++)
			{
				for (coluna=0;coluna<2;coluna++)
				{
					System.out.println("\n"+M1[linha][coluna]);
					System.out.println("\n"+M2[linha][coluna]);
				}
			}
		}
	}
}
			
	
		
	

