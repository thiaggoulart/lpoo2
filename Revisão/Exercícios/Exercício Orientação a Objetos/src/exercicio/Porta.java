package exercicio;

public class Porta {

	private boolean aberta;
	private String cor;
	private int dimensaoX;
	private int dimensaoY;
	private int dimensaoZ;
	
	public void abre() {
		
		if (this.aberta = false) {
			this.aberta = true;
		}
		
	}
	
	public void fecha() {
		
		if (this.aberta = true) {
			this.aberta = false;
		}
		
	}

	public void pinta(String cor) {
		System.out.println("Casa pintada na cor " + cor);
	}
	             
	public boolean estaAberta(){
		if(this.aberta = false) {
			System.out.println("A porta está fechada");
			return false;
		}
		
		System.out.println("A porta está aberta");
		return true;
	}
	
}
