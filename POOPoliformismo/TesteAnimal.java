package POOPoliformismo;

public class TesteAnimal {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		Animal animal = null;
		cachorro.imprimirinfo();
		cachorro.barulho(null);
		cachorro.habito(null);
		System.out.println("\n");
		cavalo.imprimirinfo();
		cavalo.barulho(null);
		cavalo.habito(null);
		System.out.println("\n");
		preguica.imprimirinfo();
		preguica.barulho(null);
		preguica.habito(null);

	}

}
