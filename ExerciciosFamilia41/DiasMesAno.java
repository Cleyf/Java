package ExerciciosFamilia41;

import java.util.Scanner;

public class DiasMesAno {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade, dias=365, meses=12,res1,res2;
				
				System.out.println("\nquantos anos voce tem?");
				idade = leia.nextInt();
				res1= dias*idade;
				System.out.println("\nsua idade em dias: "+res1);
				res2= (idade*dias)/meses;
				System.out.println("\nsua idade em meses: "+res2);
	
	}
}
