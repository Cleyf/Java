package ExerciciosRepeticao;

import java.util.Scanner;

public class While3Idade {

	public static void main(String[] args) {
		int idade,menor21=0,maior50=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe sua idade: ");
		idade = leia.nextInt();
		if (idade<=21) {
			menor21++;
		}
		if(idade>=50) {
			maior50++;
		}
		while (idade<=99) {
			System.out.println("Informe sua idade: ");
			idade = leia.nextInt();
			if (idade<=21) {
				menor21++;
			}
			if(idade>=50) {
				maior50++;
			}
		}
		
		System.out.println("\ntivemos "+menor21+ " pessoas com a idade menor que 21");
		System.out.println("\ntivemos "+maior50+ " pessoas com a idade maiorr que 50");
	}

}
