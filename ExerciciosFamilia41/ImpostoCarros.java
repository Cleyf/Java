package ExerciciosFamilia41;

import java.util.Scanner;

public class ImpostoCarros {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float ValorFabrica, distribuidor, imposto, VT;
		
		System.out.println("-----AQUISIÇÂO DE UM CARRO NOVO-----");
		System.out.println("\n Qual e o preço de fabrica? ");
		ValorFabrica = leia.nextFloat();
		distribuidor= (ValorFabrica*28)/100;
		imposto=(ValorFabrica*45)/100;
		VT= ValorFabrica+distribuidor+imposto;
		System.out.println("O valor total a ser pago vai ser: "+VT);
		

	}

}
