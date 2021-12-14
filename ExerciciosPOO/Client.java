package ExerciciosPOO;

public class Client 
{	
	private String nomeCliente;
	private int idade;
	private double fidelidade;
	private double premio;


public Client (String nomeCliente,int idade,double fidelidade,double premio)
{
	this.nomeCliente = nomeCliente;
	this.idade = idade;
	this.fidelidade = fidelidade;
	this.premio = premio;
}

public void imprimirinfo()
{
	System.out.println("\nO cliente "+nomeCliente+" de "+idade+ "anos de idade. Por ser fiel ao nosso negócio com "+fidelidade+" tempo de confiança, estará recebendo um vale de: "+premio+" reais.");
}

public String getNomeCliente() {
	return nomeCliente;
}

public void setNomeCliente(String nomeCliente) {
	this.nomeCliente = nomeCliente;
}

public int getIdade() {
	return idade;
}

public void setIdade(int idade) {
	this.idade = idade;
}

public double getFidelidade() {
	return fidelidade;
}

public void setFidelidade(double fidelidade) {
	this.fidelidade = fidelidade;
}

public double getPremio() {
	return premio;
}

public void setPremio(double premio) {
	this.premio = premio;
}


}
