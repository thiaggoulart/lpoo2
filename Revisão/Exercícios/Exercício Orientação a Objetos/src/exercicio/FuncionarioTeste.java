package exercicio;

public class FuncionarioTeste {
	
	public static void main(String[] args) {
		testaFuncionario();
	}
	
	public static void testaFuncionario() {
		Funcionario func = new Funcionario("Thiago Goulart", "TI", 1000, "18/03/2019", "045.094.050-06", true);
		func.bonifica(100);
		func.mostra();
		func.demite();
		func.mostra();
	}
}
 