package ExerciciosFamilia41;

import java.util.Scanner;

public class MediaPonderada {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		float nota1, nota2, nota3, media;
		
		System.out.println("Qual � a primeira nota?");
		nota1 = leia.nextFloat();
		System.out.println("Qual � a segunda nota?");
		nota2 = leia.nextFloat();
		System.out.println("Qual � a terceira nota?");
		nota3 = leia.nextFloat();
		
		media= (nota1*2+nota2*3+nota3*5)/10;
		
		System.out.println("A m�dia ponderada �: "+media);
		
	}
			

}
