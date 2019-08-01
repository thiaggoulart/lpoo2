package exercicio;

public class Data {
	 private int dia;
	 private int mes;
	 private int ano;
	 
	 public Data(){}
	 
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String formatada(Data data) {
		String	formatacao = (data.getDia() + "/" + data.getMes() + "/" + data.getAno());
		return formatacao;
	}
	 
	 
}
