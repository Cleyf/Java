package ExerciciosRepeticao;

public class InfNumFor1 {

	public static void main(String[] args) {
		int x;
		int divnum;
		
		for (x=0;x<1900;x++) {
			if (x>=1000 && x<=1900) {
				if (x%11==5) {
					divnum=x;
					System.out.println("\nOs numeros neste intervalo divisiveis por 11 e resta 5 são: "+divnum);
				}
			}

		}
	}
}
