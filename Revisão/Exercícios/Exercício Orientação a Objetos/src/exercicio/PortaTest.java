package exercicio;

public class PortaTest {

	public static void main(String[] args) {
		testaPorta();
	}

	public static void testaPorta() {
		
		Porta porta = new Porta();
		
		porta.setCor("azul");
		porta.setDimensaoX(1);
		porta.setDimensaoY(2);
		porta.setDimensaoZ(3);
		porta.setAberta(true);
		System.out.println("A cor da casa é: " + porta.getCor());
		porta.pinta("branca");
		
		System.out.println("Dimensao X: " + porta.getDimensaoX());
		System.out.println("Dimensao Y: " + porta.getDimensaoY());
		System.out.println("Dimensao Z: " + porta.getDimensaoZ());
		porta.abre();
		porta.fecha();
		porta.fecha();
		porta.abre();
		System.out.println("A cor da casa é: " + porta.getCor());
		porta.pinta("rosa");
		
		porta.setDimensaoX(4);
		porta.setDimensaoY(5);
		porta.setDimensaoZ(6);
		System.out.println("Dimensao X: " + porta.getDimensaoX());
		System.out.println("Dimensao Y: " + porta.getDimensaoY());
		System.out.println("Dimensao Z: " + porta.getDimensaoZ());
		System.out.println("A cor da casa é: " + porta.getCor());
	}
}
