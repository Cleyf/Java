package ExerciciosRepeticao;

import java.util.Scanner;

public class DoWhile2Mult3 {

	public static void main(String[] args) {
		int numero,cont=0, multp3=0;
		float media;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		cont++;
		if(numero %3==0) {
			multp3++;
			cont+=numero;
		}
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			cont++;
			if(numero %3==0) {
				multp3++;
				cont+=numero;
			}
		} while (numero!=0);
		media=cont/multp3;
		System.out.println("A media dos numeros divisiveis por 3 é "+media);
	}

}
