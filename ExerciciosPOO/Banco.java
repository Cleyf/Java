package ExerciciosPOO;

public class Banco {
	
	private String nome;
	private int agencia;
	private double valor;
	
	public Banco(String nome,int agencia,double valor)
	{
		this.nome = nome;
		this.agencia = agencia;
		this.valor=valor;
	}
	
	public void imprimirinfo()
	{
		System.out.println("\nNome: "+nome+"\n Agência: "+agencia+"\n Saldo: "+valor);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}


	public double getValor() {
		return valor;
	}

	public void setValor(long valor) {
		this.valor = valor;
	}
	
}
