package conta;

public class Aula1 {
	public static void main(String[] args) {
		// criando a conta
		Conta minhaConta = null;
		minhaConta = new Conta();

		/*// alterando os valores de minhaConta
		minhaConta.nome = "Rodrigo";
		minhaConta.saldo = 1000;
		minhaConta.saca(200); // saca 200 reais
		minhaConta.deposita(500); // deposita 500 reais
		System.out.println(minhaConta.saldo);
		
		// criando a conta
	    minhaConta = new Conta();
	    minhaConta.saldo = 1000;
	    System.out.println(minhaConta.saca(00));*/
		
		/*minhaConta.deposita(100);
		
		Conta minhaContaDosSonhos = minhaConta;
		
		minhaContaDosSonhos.deposita(100000);
		
		System.out.println("Saldo: " + minhaContaDosSonhos.saldo);*/
		
		
		/*Conta minhaConta2 = null;
		minhaConta2 = new Conta();
		minhaConta2.deposita(100);
		
		if(minhaConta == minhaConta2) {//compara o espaço de memoria
			System.out.println("Igual"); 
		}/*if(minhaConta.saldo == minhaConta2.saldo) { // compara o conteudo
			System.out.println("Igual");
			}else {
			System.out.println("Diferente");*/
		
		
	    minhaConta.nome="Rodrigo";
	    minhaConta.saldo=1000;

	    Conta outraConta = new Conta();
	    outraConta.nome="Rodrigo";
	    outraConta.saldo=1000;

	    //minhaConta transfere para outraConta 100 reais
	    minhaConta.transfere(outraConta, 100);
	    System.out.println("Saldo da Minha Conta = "+minhaConta.saldo);
	    System.out.println("Saldo da Outra Conta = "+outraConta.saldo);
		
	}

}
