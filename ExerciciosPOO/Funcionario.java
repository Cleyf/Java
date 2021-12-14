package ExerciciosPOO;

public class Funcionario {
	private String nome;
	private int codigo;
	private double salario;
	
	
	public Funcionario (String nome ,int codigo ,double salario)
	{
		this.nome= nome;
		this.codigo = codigo;
		this.salario = salario;
	}
	

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public double getSalario() {
			return salario;
		}

		public void setSalario(double salario) {
			this.salario = salario;
		}
		public void imprimirinfo()
		{
			System.out.println("\n"+nome+"\n código: "+codigo+"\nSálario: "+salario);
		}
}
