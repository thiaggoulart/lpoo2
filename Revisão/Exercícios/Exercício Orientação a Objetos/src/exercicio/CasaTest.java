package exercicio;

public class CasaTest {

	public static void main(String[] args) {
		testaCasa();
	}

	public static void testaCasa() {
		
		Casa casa = new Casa();
		casa.setCor("branco");
		casa.setPorta1(true);
		casa.setPorta2(false);
		casa.setPorta3(true);
		
		casa.pinta("azul");
		casa.quantasPortasEstaoAbertas();
	}
	
}
