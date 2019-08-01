package exercicio;

public class FuncionarioTest {

	public static void main(String[] args) {
		testaFuncionario();
		testaFuncionariosIguais();
		testaFuncionariosComMesmaReferencia();
		testaDataDeEntrada();
	}

	public static void testaFuncionario() {
		
		Data data = new Data();
		data.setDia(12);
		data.setMes(04);
		data.setAno(2019);
		
		Funcionario func = new Funcionario();
		func.setNome("Thiago Goulart");
		func.setDepartamento("TI");
		func.setSalario(1000);
		func.setRg("123456789");
		func.setDataEntrada(data);
		func.setEstaNaEmpresa(true);
		
		func.bonifica(100);
		func.mostra();
		func.demite();
		func.mostra();

	}

	public static void testaFuncionariosIguais() {
		
		Data data1 = new Data();
		data1.setDia(12);
		data1.setMes(04);
		data1.setAno(2019);
		
		Data data2 = new Data();
		data2.setDia(14);
		data2.setMes(01);
		data2.setAno(1995);
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Thiago Goulart");
		f1.setDepartamento("TI");
		f1.setSalario(1000);
		f1.setRg("123456789");
		f1.setDataEntrada(data1);
		f1.setEstaNaEmpresa(true);

		Funcionario f2 = new Funcionario();
		f2.setNome("Rodrigo Noll");
		f2.setDepartamento("TI");
		f2.setSalario(10000);
		f2.setRg("987654321");
		f2.setDataEntrada(data2);
		f2.setEstaNaEmpresa(false);

		f1.igual(f1);
		f1.igual(f2);
		f1.igual(null);
		
		System.out.println("\n ---------------------------------- \n");
	}
	
	public static void testaFuncionariosComMesmaReferencia(){
		
		Data data = new Data();
		data.setDia(18);
		data.setMes(03);
		data.setAno(2019);
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Lara Ludwig");
		f1.setDepartamento("TI");
		f1.setSalario(1800);
		f1.setRg("654321789");
		f1.setDataEntrada(data);
		f1.setEstaNaEmpresa(true);
		Funcionario f2 = f1;
		
		System.out.println("Nome: " + f2.getNome());
		System.out.println("Departamento: " + f2.getDepartamento());
		System.out.println("Salário: " + f2.getSalario());
		System.out.println("Data de Entrada: " + f2.getDataEntrada());
		System.out.println("RG: " + f2.getRg());
		
		if (f2.isEstaNaEmpresa() == true) {
			System.out.println("Empregado da empresa");
		} else {
			System.out.println("Não trabalha mais na empresa");
		}
		
		f1.igual(f2);
		
		System.out.println("\n ---------------------------------- \n");
	}
	
	public static void testaDataDeEntrada() {
		Data data = new Data();
		data.setDia(18);
		data.setMes(03);
		data.setAno(2019);
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Lara Ludwig");
		f1.setDepartamento("TI");
		f1.setSalario(1800);
		f1.setRg("654321789");
		f1.setEstaNaEmpresa(true);
		
		f1.mostra();

		f1.setDataEntrada(data);
		
		f1.mostra();
	}

}
