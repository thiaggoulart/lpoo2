package exercicio;

public class Porta {

	private boolean aberta;
	private String cor;
	private int dimensaoX;
	private int dimensaoY;
	private int dimensaoZ;

	public Porta() {
	}

	public boolean isAberta() {
		return aberta;
	}

	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getDimensaoX() {
		return dimensaoX;
	}

	public void setDimensaoX(int dimensaoX) {
		this.dimensaoX = dimensaoX;
	}

	public int getDimensaoY() {
		return dimensaoY;
	}

	public void setDimensaoY(int dimensaoY) {
		this.dimensaoY = dimensaoY;
	}

	public int getDimensaoZ() {
		return dimensaoZ;
	}

	public void setDimensaoZ(int dimensaoZ) {
		this.dimensaoZ = dimensaoZ;
	}

	public void abre() {

		if (this.aberta == false) {
			System.out.println("A porta foi aberta");
			this.aberta = true;
			
		}else {
			System.out.println("A porta já está aberta");
		}

	}

	public void fecha() {

		if (this.aberta == true) {
			System.out.println("A porta foi fechada");
			this.aberta = false;
		}else {
			System.out.println("A porta já está fechada");
		}		

	}

	public void pinta(String cor) {
		System.out.println("Porta pintada na cor " + cor);
		this.cor = cor;
	}

	public boolean estaAberta() {
		if (this.aberta = false) {
			System.out.println("A porta está fechada");
			return false;
		}

		System.out.println("A porta está aberta");
		return true;
	}

}
