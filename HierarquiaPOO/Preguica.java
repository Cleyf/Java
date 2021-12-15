package HierarquiaPOO;

public class Preguica extends Animal {
	private String reino;
	private String classe;
	private String ordem;
	private String familia;
	
	public Preguica (String nome,int idade,String som,String habito,String reino,String classe,String ordem,String familia)
	{
		super(nome,idade,som,habito);
		this.reino =reino;
		this.classe = classe;
		this.ordem = ordem;
		this.familia= familia;
	}

	public String getReino() {
		return reino;
	}

	public void setReino(String reino) {
		this.reino = reino;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getOrdem() {
		return ordem;
	}

	public void setOrdem(String ordem) {
		this.ordem = ordem;
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}
	public void imprimirinfo()
	{
		System.out.println("\n Nome: "+getNome()+"\n Idade: "+getIdade()+"\n Som: "+getSom()+"\n Hábitos: "
				+getHabito()+"\n Reino: "+reino+"\nClasse: "+classe+"\n Ordem"+ordem+"\nFamilia"+familia);
	}
	
}
