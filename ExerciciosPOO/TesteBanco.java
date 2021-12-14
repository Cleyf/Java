package ExerciciosPOO;

public class TesteBanco {

	public static void main(String[] args) {
		Banco[] list = new Banco[5];
		
		list[0] = new Banco ("Lailo",2413,4200);
		list[1]  =new Banco ("Breno",2413,-1247);
		list[2] =new Banco ("Maria Rica",2369,1200000);
		list[3] =new Banco ("Carlos Souza",2416,12000);
		list[4] =new Banco ("Juliana Pena",2415,12000);
		
		
		for(Banco para:list)
		{
			para.imprimirinfo();
		}

	}

}
