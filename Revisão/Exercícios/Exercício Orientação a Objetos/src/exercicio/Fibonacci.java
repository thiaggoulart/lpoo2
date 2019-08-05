 package exercicio;

public class Fibonacci {
	
	public static int calculaFibonacci(int numero) {
		
		if(numero == 1 || numero == 2) {
			return 1;
		}else {
		
			return calculaFibonacci(numero - 1) + calculaFibonacci(numero - 2);
			
		}
		
	}
}


