package ExerciciosRepeticao;

import java.util.Scanner;

public class DoWhileSomaDig {

	public static void main(String[] args) {
		int numero, somador=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		numero = leia.nextInt();
		if (numero==0)
		{
			System.out.println("Por favor informe outro numero acima de 0");
			numero = leia.nextInt();
		}
		somador+=numero;
		do {
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();
			somador += numero;
		} while(numero!=0);
		
		System.out.println("A soma dor numero é: "+somador);

	}

}
