package POOPoliformismo;

public abstract class Animal {
	private String nome;
	private int idade;

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	abstract public void habito (String mov);
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	abstract public void barulho (String som);
	
	public Animal (String nome,int idade)
	{
		this.nome=nome;
		this.idade=idade;
	}
}
