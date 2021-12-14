package ExerciciosPOO;

public class TesteEletronico {

	public static void main(String[] args) {
		Eletronico[] tipo = new Eletronico[3];
		
		tipo[0] = new Eletronico("Computador",3500);
		tipo[1] = new Eletronico("Celular",1200 );
		tipo[2] = new Eletronico("Televisao",2200);
		
		for(Eletronico lailo:tipo)
		{
			lailo.imprimirinfo();
		}

	}

}
