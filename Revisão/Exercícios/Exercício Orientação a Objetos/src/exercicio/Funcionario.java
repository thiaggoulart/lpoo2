package exercicio;

public class Funcionario {
	
	private String nome;
	private String departamento;
	private double salario;
	private String dataEntrada;
	private String rg;
	private boolean estaNaEmpresa;
	
	
	public Funcionario(String nome, String departamento, double salario, String dataEntrada, String rg,
			boolean estaNaEmpresa) {
		super();
		this.nome = nome;
		this.departamento = departamento;
		this.salario = salario;
		this.dataEntrada = dataEntrada;
		this.rg = rg;
		this.estaNaEmpresa = estaNaEmpresa;
	}



	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public String getDepartamento() {
		return departamento;
	}




	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}




	public double getSalario() {
		return salario;
	}




	public void setSalario(double salario) {
		this.salario = salario;
	}




	public String getDataEntrada() {
		return dataEntrada;
	}




	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}




	public String getRg() {
		return rg;
	}




	public void setRg(String rg) {
		this.rg = rg;
	}




	public boolean isEstaNaEmpresa() {
		return estaNaEmpresa;
	}




	public void setEstaNaEmpresa(boolean estaNaEmpresa) {
		this.estaNaEmpresa = estaNaEmpresa;
	}




	public void bonifica (double aumento) {
		salario +=  aumento;
	}
	public void demite() {
		estaNaEmpresa = false;

	}
	
	public void mostra() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salário: " + this.salario);
        System.out.println("Data de Entrada: " + this.dataEntrada);
        System.out.println("RG: " + this.rg);
        if(this.estaNaEmpresa == true) {
        	System.out.println("Empregado da empresa");
        }else {
        	System.out.println("Não trabalha mais na empresa");
        }
   }
}	