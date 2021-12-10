package ExerciciosRepeticao;

import java.util.Scanner;

public class While4Pesquisa {

	public static void main(String[] args) {
		int pessoa, idade, opcao,temperamento, somaC=0, mulherN=0, homemA=0, outrosCal=0, P40agre=0, P18calmo=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe a primeira pessoa da pesquisa: ");
		pessoa = leia.nextInt();
		System.out.println("\nInforme a sua idade: ");
		idade = leia.nextInt();
		System.out.println("\nInforme a sua orientação sexual: ");
		System.out.println("\n1-Masculino");
		System.out.println("\n2-Feminino");
		System.out.println("\n3- Outro");
		opcao = leia.nextInt(); 
		System.out.println("\nQual é o seu temperamento? ");
		System.out.println("\n1-Calmo");
		System.out.println("\n2-Nervoso");
		System.out.println("\n3- Agressivo");
		temperamento = leia.nextInt(); 
		
		if (temperamento==1) 
		{
			somaC++;
		}
		if (opcao==2 && temperamento==2)
		{
			mulherN++;
		}
		if (opcao==1 && temperamento==3)
		{
			homemA++;
		}
		if (opcao==3 && temperamento==1)
		{
			outrosCal++;
		}
		if (idade>=40 && temperamento==2)
		{
			P40agre++;
		}
		if (idade<=18 && temperamento==1) 
		{
			P18calmo++;
		}
			
		
		while (pessoa<=10) {
			
			System.out.println("Informe pessoa da pesquisa: ");
			pessoa = leia.nextInt();
			System.out.println("\nInforme a sua idade: ");
			idade = leia.nextInt();
			System.out.println("\nInforme a sua orientação sexual: ");
			System.out.println("\n1-Masculino");
			System.out.println("\n2-Feminino");
			System.out.println("\n3- Outro");
			opcao = leia.nextInt(); 
			System.out.println("\nQual é o seu temperamento? ");
			System.out.println("\n1-Calmo");
			System.out.println("\n2-Nervoso");
			System.out.println("\n3- Agressivo");
			temperamento = leia.nextInt();
			
			if (temperamento==1) 
			{
				somaC++;
			}
			if (opcao==2 && temperamento==2)
			{
				mulherN++;
			}
			if (opcao==1 && temperamento==3)
			{
				homemA++;
			}
			if (opcao==3 && temperamento==1)
			{
				outrosCal++;
			}
			if (idade>=40 && temperamento==2)
			{
				P40agre++;
			}
			if (idade<=18 && temperamento==1) 
			{
				P18calmo++;
			}
		}
		System.out.println("\nO numero de pessoas calma é de: "+somaC);
		System.out.println("\no número de mulheres nervosas: "+mulherN);
		System.out.println("\no número de homens agressivos: "+homemA);
		System.out.println("\no número de outros calmos: "+outrosCal);
		System.out.println("\no número de pessoas nervosas com mais de 40 anos: "+P40agre);
		System.out.println("o número de pessoas calmas com menos de 18 anos: "+P18calmo);
	}

}
