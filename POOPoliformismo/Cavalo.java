package POOPoliformismo;

public class Cavalo extends Animal {
	public Cavalo()
	{
		super("Lailo",6);
	}
	@Override
	public void barulho(String som)
	{
		System.out.println("IHIHIHIHIHIHHHIHIHIIHI");
		System.out.println("POCOTO POCOTO POCOTO");
	}
	
	@Override 
	public void habito(String mov) {
		System.out.println("Correndo, RUUUUNN");
		System.out.println("Pocoto Pocoto Pocoto");
	}
	
	public void imprimirinfo()
	{
		System.out.println("\nCavalo Lailo, 6 anos");
	}
}
