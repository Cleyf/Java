package POOCollection;

import java.util.ArrayList;
import java.util.Scanner;

public class exerc3POO {

	public static void main(String[] args) {
		
		int op;
		Scanner leia = new Scanner(System.in);
		ArrayList <String> estoque = new ArrayList<String>();
		
		do {
		System.out.println("\n***********************************");
		System.out.println("\n(1) Para adicionar um novo produto");
		System.out.println("\n(2) Para Remover um produto");
		System.out.println("\n(3) Para Atualizar produtos");
		System.out.println("\n(4) Para apresentar os produtos");
		op = leia.nextInt();
		switch (op)
		{
		case 1:
			leia.nextLine();
			System.out.println("\nDigite o nome do Produto a ser adicionado a lista");
			String produto = leia.nextLine();
			estoque.add(produto);
			break;
		case 2:
			leia.nextLine();
			System.out.println("\nDigite o produto a ser removido");
			String produtor = leia.nextLine();
			if(estoque.contains(produtor))
			{
				estoque.remove(op);
			}
			else
			{
				System.out.println("\n Item não existente no estoque");
			}
			break;
		case 3:
			leia.nextLine();
			System.out.println("\nQual produto deseja atualizar?");
			String verifica = leia.nextLine();
			System.out.println("Qual produto entrara no lugar?");
			String novo = leia.nextLine();
			if(estoque.contains(verifica))
			{
				estoque.remove(verifica);
				estoque.add(novo);
			}
			else
			{
				System.out.println("\n Item não existente no estoque");
			}
			break;
		case 4:
			System.out.println("\nEstes são os itens do nosso estoque atualmente: ");
			System.out.println(estoque);
			break;
		}
		}while (op!=0);

	}

}
