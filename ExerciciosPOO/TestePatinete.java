package ExerciciosPOO;

public class TestePatinete {

	public static void main(String[] args) {
		Patinete meuPatinete = new Patinete();
		meuPatinete.cor = "Cinza";
		meuPatinete.velocidadeInicial = 0;
		meuPatinete.velocidadeMaxima = 50;
		
		meuPatinete.sobe();

		meuPatinete.acelera(20);
		System.out.println(meuPatinete.velocidadeInicial);
		
	}

}
