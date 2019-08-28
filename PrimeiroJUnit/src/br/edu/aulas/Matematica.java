package br.edu.aulas;
public class Matematica {
	
	public int soma(int x, int y) {
		if (x > 999) {
            throw new IllegalArgumentException("X deve ser menor que 1000");
        }
        return x + y;
	}
	
	public int subtrai(int x, int y) {
		if (x > 999) {
            throw new IllegalArgumentException("X deve ser menor que 1000");
        }
        return x - y;
	}
	
    public int multiplica(int x, int y) {
        if (x > 999) {
            throw new IllegalArgumentException("X deve ser menor que 1000");
        }
        return x * y;
    }
    
    public int divide(int x, int y) {
        if (x > 999) {
            throw new IllegalArgumentException("X deve ser menor que 1000");
        }
        if(y == 0) {
        	throw new IllegalArgumentException("N�o � poss�vel fazer divis�o por 0");
        } 
        return x / y;
    }
}