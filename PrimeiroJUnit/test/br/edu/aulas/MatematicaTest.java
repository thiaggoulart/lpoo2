package br.edu.aulas;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MatematicaTest {
	Matematica matematica;

	@Before
	public void setup() {
		matematica = new Matematica();
	}

	@BeforeClass
	public static void testSetup() {
	}

	@AfterClass
	public static void testCleanup() {
		// Limpa os dados usados no Test Case
	}

	@Test
	public void testaSomaPositivo() {
		assertEquals("2 + 2 deve ser 4", 4, matematica.soma(2, 2));
	}

	@Test
	public void testaSomaPositivoComNegativo() {
		assertEquals("2 + (-2) deve ser 0", 0, matematica.soma(2, -2));
	}

	@Test
	public void testaSomaNegativo() {
		assertEquals("-2 + (-2) deve ser -4", -4, matematica.soma(-2, -2));
	}

	@Test
	public void testaSomaPositivoComZero() {
		assertEquals("2 + 0 deve ser 2", 2, matematica.soma(2, 0));
	}

	@Test
	public void testaSomaNegativoComZero() {
		assertEquals("-2 + 0 deve ser -2", -2, matematica.soma(-2, 0));
	}

	@Test
	public void testaSomaZeroComZero() {
		assertEquals("0 + 0 deve ser 0", 0, matematica.soma(0, 0));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testaOLancamentoDaExcecaoDaSoma() {
		matematica.soma(1000, 2);
	}

	@Test
	public void testaSubtraiPositivo() {
		assertEquals("2 - 2 deve ser 0", 0, matematica.subtrai(2, 2));
	}

	@Test
	public void testaSubtraiPositivoComNegativo() {
		assertEquals("2 - (-2) deve ser 4", 4, matematica.subtrai(2, -2));
	}

	@Test
	public void testaSubtraiNegativo() {
		assertEquals("(-2) - (-2) deve ser 0", 0, matematica.subtrai(-2, -2));
	}

	@Test
	public void testaSubtraiPositivoComZero() {
		assertEquals("2 - 0 deve ser 2", 2, matematica.subtrai(2, 0));
	}

	@Test
	public void testaSubtraiNegativoComZero() {
		assertEquals("-2 - 0 deve ser -2", -2, matematica.subtrai(-2, 0));
	}

	@Test
	public void testaSubtraiZeroComZero() {
		assertEquals("0 - 0 deve ser 0", 0, matematica.subtrai(0, 0));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testaOLancamentoDaExcecaoDaSubtracao() {
		matematica.subtrai(1000, 2);
	}

	@Test
	public void testaMutiplicaPositivo() {
		assertEquals("2 x 2 deve ser 4", 4, matematica.multiplica(2, 2));

	}

	@Test
	public void testaMutiplicaPositivoComNegativo() {
		assertEquals("2 x -2 deve ser -4", -4, matematica.multiplica(2, -2));

	}

	@Test
	public void testaMutiplicaNegativo() {
		assertEquals("-2 x -2 deve ser 4", 4, matematica.multiplica(-2, -2));

	}

	@Test
	public void testaMutiplicaPositivoComZero() {
		assertEquals("2 x 0 deve ser 0", 0, matematica.multiplica(2, 0));

	}

	@Test
	public void testaMutiplicaNegativoComZero() {
		assertEquals("-2 x 0 deve ser 0", 0, matematica.multiplica(-2, 0));

	}
	
	@Test
	public void testaMutiplicaZeroComZero() {
		assertEquals("0 x 0 deve ser 0", 0, matematica.multiplica(0, 0));

	}

	@Test(expected = IllegalArgumentException.class)
	public void testaOLancamentoDaExcecaoDaMultiplicacao() {
		matematica.multiplica(1000, 2);
	}
	
	@Test
	public void testaDividePositivo() {
		assertEquals("2 / 2 deve ser 1", 1, matematica.divide(2, 2));

	}

	@Test
	public void testaDividePositivoComNegativo() {
		assertEquals("2 / -2 deve ser -1", -1, matematica.divide(2, -2));

	}

	@Test
	public void testaDivideNegativo() {
		assertEquals("-2 x -2 deve ser 1", 1, matematica.divide(-2, -2));

	}

	@Test(expected = IllegalArgumentException.class)
	public void testaDividePositivoComZero() {
		matematica.divide(2, 0);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testaDivideNegativoComZero() {
		assertEquals("-2 x 0 deve ser 0", 0, matematica.divide(-2, 0));

	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testaDivideZeroComZero() {
		assertEquals("0 x 0 deve ser 0", 0, matematica.divide(0, 0));

	}

	@Test(expected = IllegalArgumentException.class)
	public void testaOLancamentoDaExcecaoDaDivisao() {
		matematica.divide(1000, 2);
	}

}