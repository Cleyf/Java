package ExerciciosPOO;

public class Aviao {
	private String tipoAviao;
	private double tamanho;
	private double velocidadeMax;
	private double altitude;
	
	public Aviao (String tipoAviao, double tamanho,double velocidadeMax, double altitude)
	{
		this.tipoAviao = tipoAviao;
		this.tamanho = tamanho;
		this.velocidadeMax = velocidadeMax;
		this.altitude = altitude;
	}
	
	public void imprimirinfo()
	{
		System.out.println("\n O avião "+tipoAviao+" tem "+tamanho+ " de comprimento, e chega a velocidade maxima de "+velocidadeMax+" Km/h, e chega a "+" de altura");
	}


	public String getTipoAviao() {
		return tipoAviao;
	}

	public void setTipoAviao(String tipoAviao) {
		this.tipoAviao = tipoAviao;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public double getVelocidadeMax() {
		return velocidadeMax;
	}

	public void setVelocidadeMax(double velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}

	public double getAltitude() {
		return altitude;
	}

	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}
	

}
