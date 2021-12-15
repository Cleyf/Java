package HierarquiaPOO;

public class Animal {
private String nome;
private int idade;
private String som;
private String habito;

public Animal(String nome,int idade,String som,String habito)
{
	this.nome = nome;
	this.idade= idade;
	this.som = som;
	this.habito = habito;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getIdade() {
	return idade;
}

public void setIdade(int idade) {
	this.idade = idade;
}

public String getSom() {
	return som;
}

public void setSom(String som) {
	this.som = som;
}

public String getHabito() {
	return habito;
}

public void setHabito(String habito) {
	this.habito = habito;
}

}
