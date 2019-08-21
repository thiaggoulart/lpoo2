package carro;

public class Carro {
	private String cor;
	private String modelo;
	private double velocidadeAtual;
	private double velocidadeMaxima;
	private Motor motor;
	
	public Carro(String cor, String modelo, double velocidadeAtual, double velocidadeMaxima, Motor motor) {
		super();
		this.cor = cor;
		this.modelo = modelo;
		this.velocidadeAtual = velocidadeAtual;
		this.velocidadeMaxima = velocidadeMaxima;
		this.motor = motor;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}	
	
	public void liga() {
		System.out.println("O carro está ligado");
	}
	
	public void acelera(double quantidade) {
		
		this.velocidadeAtual += quantidade;
		
	}
	
	public int getMarcha() {
		
		if(this.velocidadeAtual < 0) {
			return -1;
		}
		if(this.velocidadeAtual  >= 0 && this.velocidadeAtual <= 40) {
			return 1;
		}
		if(this.velocidadeAtual  > 40 && this.velocidadeAtual <= 60) {
			return 2;
		}
		return 3;
	}
	
}
