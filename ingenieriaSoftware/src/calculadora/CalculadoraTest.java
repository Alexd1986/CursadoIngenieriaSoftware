package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	static Calculadora calc;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		calc = new Calculadora();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
		calc.clear();
	}

	@Test
	void testSub() {
		int resultado = calc.sub(2, 3);
		int esperado = -1;
		assertEquals(esperado,resultado);
	}

	@Test
	void testAdd() {
		System.out.println("add()");
		int resultado = calc.add(2, 3);
		int esperado = 5;
		assertEquals(esperado, resultado);
	}

}
