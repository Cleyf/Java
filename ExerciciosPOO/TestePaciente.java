package ExerciciosPOO;

public class TestePaciente {

	public static void main(String[] args) {
	
		Paciente[] lista = new Paciente[4];
		
		lista[0] = new Paciente("Paulo Barbosa",42,"C�ncer");
		lista[1] = new Paciente("Bruna Souza",22,"Covid-19");
		lista[2] = new Paciente ("Leonice Cruz",70,"Demencia");
		lista [3] = new Paciente ("Caroline Bonita Oliveira",28,"Les�o no P�");
		
		for(Paciente para:lista)
		{
			para.imprimirinfo();
		}

	}

}
