package ExerciciosFamilia41;

public class DistanciaPlano {

	public static void main(String[] args) {
		
		double P1, P2, x1 =2, x2=3, y1=4, y2=5,dx, dy,dxy, D;
		
		System.out.println("C A L C U L O   D E  D I S T A N C I A");
		P1 = (x1+x2);
		P2 = (y1+y2);
		dx = Math.pow((x2-x1), 2);
		dy = Math.pow((y2-y1), 2);
		dxy= dx+ dy;
		D = Math.sqrt(dxy);
		
			
		System.out.println("A distância entre P1 e P2 é: "+D);

	}

}
