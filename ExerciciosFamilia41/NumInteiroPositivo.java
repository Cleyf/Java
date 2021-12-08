package ExerciciosFamilia41;

import java.util.Scanner;

public class NumInteiroPositivo {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		double A, B, C, D, R, S;
		
		System.out.println("Digite um número inteiro:");
		A = leia.nextInt();
		System.out.println("Digite outro número inteiro: ");
		B= leia.nextInt();
		System.out.println("Digite outro número inteiro: ");
		C= leia.nextInt();
		
		R=Math.pow((A+B), 2);
		System.out.println("O valor de R é:"+R);
		S=Math.pow((B+C), 2);
		System.out.println("O valor de S é:"+S);
		D=(R+S)/2;
				
		System.out.println("O valor de de D= (R+S)/2 é: "+D);
		
	}

}
