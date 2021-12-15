package HierarquiaPOO;

public class TesteHierarquia {

	public static void main(String[] args) {
		Cachorro Fenrir = new Cachorro ("Fenrir",6,"Latir","Correr","Animalia","Mammalia","Carnivora","Canidae");
		Cavalo Pegasus = new Cavalo ("Pegasus",4,"Relincha","Correr","Animalia","Mammalia","Perissodactyla","Equidae");
		Preguica afonso = new Preguica ("Afonso",8,"Não","Sobe em arvores","Animalia","Mammalia","Pilonsa","Bradipodídeos");
		
		Fenrir.imprimirinfo();
		Pegasus.imprimirinfo();
		afonso.imprimirinfo();
	}

}
