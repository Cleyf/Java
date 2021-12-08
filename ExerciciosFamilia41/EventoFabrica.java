package ExerciciosFamilia41;

import java.util.Scanner;

public class EventoFabrica {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int segundos=3600, minutos=60, horas, res1, res2;
		
		System.out.println("------EVENTO DE ANIVERSARIO DA FABRICA------");
		System.out.println("----------------MACHADO 98------------------");
		System.out.println("capacitação de colaboradores \\n");
		System.out.println("quantas horas tem o evento de capacitação? ");
		horas = leia.nextInt();
		System.out.println("\nO evento tem: "+horas);
		res1=horas*segundos;
		System.out.println("\n esse evento em segundos tem: "+res1);
		res2=horas*minutos;
		System.out.println("\n Esse evento em minutos tem: "+res2);
	}

}
