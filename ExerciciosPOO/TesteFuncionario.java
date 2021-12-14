package ExerciciosPOO;

public class TesteFuncionario {

	public static void main(String[] args) {
	
		Funcionario[] lista = new Funcionario[5];
		
		lista[0] = new Funcionario("Janeiro Fevereiro de Março Abril",2435,1270);
		lista[1] = new Funcionario("Exautina Maria",5469,1970);
		lista[2] = new Funcionario("Roberto Roberts",6987,3200);
		lista[3] = new Funcionario("Milernino Gomes",6588,1270);
		lista[4] = new Funcionario("Caramela da Silva",2435,4270);
		
		for(Funcionario roda:lista) 
		{
			roda.imprimirinfo();
		}
	}
}
