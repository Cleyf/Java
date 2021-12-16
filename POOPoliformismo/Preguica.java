package POOPoliformismo;

public class Preguica extends Animal {
	public Preguica()
	{
		super("Carlinhos",23);
	}
	@Override
	public void barulho(String som)
	{
		System.out.println("AHHHH, AHHHHH AHHHHH.........");
	}
	
	@Override 
	public void habito(String mov) {
		System.out.println("Subindo na arvore UP UP");
	}
	
	public void imprimirinfo()
	{
		System.out.println("\nPreguica Carlinhos, 23 anos");
	}
}
