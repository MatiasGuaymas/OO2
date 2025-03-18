package ar.edu.unlp.info.oo1._Ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PiedraTest {
	private Piedra piedra;
	
	@BeforeEach
	public void setUp() {
		piedra = new Piedra();
	}
	
	@Test
	public void testJugarContra() {
		assertEquals("Empate", piedra.jugarContra(piedra));
	}
	
	@Test
	public void testJugarContraPiedra() {
		assertEquals("Empate", piedra.jugarContraPiedra());
	}

	@Test
	public void testJugarContraPapel() {
		assertEquals("Gana Papel", piedra.jugarContraPapel());
	}

	@Test
	public void testJugarContraTijera() {
		assertEquals("Gana Piedra", piedra.jugarContraTijera());
	}

	@Test
	public void testJugarContraLagarto() {
		assertEquals("Gana Piedra", piedra.jugarContraLagarto());
	}

	@Test
	public void testJugarContraSpock() {
		assertEquals("Gana Spock", piedra.jugarContraSpock());
	}

}
