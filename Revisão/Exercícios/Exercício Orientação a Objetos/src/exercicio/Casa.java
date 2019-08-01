package exercicio;

public class Casa {

	private String cor;
	private boolean porta1;
	private boolean porta2;
	private boolean porta3;

	public Casa() {
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isPorta1() {
		return porta1;
	}

	public void setPorta1(boolean porta1) {
		this.porta1 = porta1;
	}

	public boolean isPorta2() {
		return porta2;
	}

	public void setPorta2(boolean porta2) {
		this.porta2 = porta2;
	}

	public boolean isPorta3() {
		return porta3;
	}

	public void setPorta3(boolean porta3) {
		this.porta3 = porta3;
	}

	public void pinta(String cor) {
		System.out.println("Casa pintada na cor " + cor);
	}

	public int quantasPortasEstaoAbertas() {
		int cont = 0;

		if (this.porta1 == true) {
			cont++;
		}
		if (this.porta2 == true) {
			cont++;
		}
		if (this.porta3 == true) {
			cont++;
		}

		System.out.println("Quantida de portas abertas: " + cont);
		return cont;
	}
}
