package ExerciciosFamilia41;

import java.util.Scanner;

public class NumInteiroPositivo {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		double A, B, C, D, R, S;
		
		System.out.println("Digite um n�mero inteiro:");
		A = leia.nextInt();
		System.out.println("Digite outro n�mero inteiro: ");
		B= leia.nextInt();
		System.out.println("Digite outro n�mero inteiro: ");
		C= leia.nextInt();
		
		R=Math.pow((A+B), 2);
		System.out.println("O valor de R �:"+R);
		S=Math.pow((B+C), 2);
		System.out.println("O valor de S �:"+S);
		D=(R+S)/2;
				
		System.out.println("O valor de de D= (R+S)/2 �: "+D);
		
	}

}
