package ExerciciosPOO;

public class Patinete {
	 String cor;
	 double velocidadeInicial;
	 double velocidadeMaxima;
	
	void sobe()
	{
		System.out.println("Subiu No Patinete UHUL...");
	}
	void acelera(double quantidade)
	{
		double velocidadeNova = this.velocidadeInicial+quantidade;
		this.velocidadeInicial = velocidadeNova;
	}
	int passada()
	{
		if(this.velocidadeInicial<0)
		{
			return -1;
		}
		if(this.velocidadeInicial>0 && this.velocidadeInicial<10)
		{
			return 10;
		}
		if(this.velocidadeInicial>20 && this.velocidadeInicial<50)
		{
			return 20;
		}
		return 50;
	}
}
