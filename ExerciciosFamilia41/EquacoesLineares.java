package ExerciciosFamilia41;

import java.util.Scanner;

public class EquacoesLineares {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int A, B, C, D, E, F, X, Y;
		
		System.out.println("\nSistemas de equa��es lineares");
		System.out.println("d� um valor para A: ");
		A = leia.nextInt();
		System.out.println("d� um valor para B: ");
		B = leia.nextInt();
		System.out.println("d� um valor para C: ");
		C = leia.nextInt();
		System.out.println("d� um valor para D: ");
		D = leia.nextInt();
		System.out.println("d� um valor para E: ");
		E = leia.nextInt();
		System.out.println("d� um valor para F: ");
		F = leia.nextInt();
		
		X = ((C * E) - (B * F)) / ((A * E) - (B * D));
		Y = ((A * F) - (C * D)) / ((A * E) - (B * D));
		
		System.out.println("O valor de X �: "+X);
		System.out.println("O valor de Y �: "+Y);

	}

}
