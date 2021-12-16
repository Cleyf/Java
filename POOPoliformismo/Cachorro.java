package POOPoliformismo;

public class Cachorro extends Animal {
	
	public Cachorro()
	{
		super("Roberto",2);
	}
	@Override
	public void barulho(String som)
	{
		System.out.println("AU AU AU AU AU");
	}
	
	@Override 
	public void habito(String mov) {
		System.out.println("Correndo, RUUUUNN");
	}
	
	public void imprimirinfo()
	{
		System.out.println("\nCachorro Roberto, 2 anos");
	}
	
}
