package ExerciciosPOO;

import java.text.NumberFormat;

public class Eletronico 
{
	private String nome;
	private double preco;
	
	public Eletronico (String nome,double preco)
	{
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void imprimirinfo()
	{
		System.out.println("\n"+nome+"\t\tR$"+preco+" reais");
	}
}
