package ar.edu.unlp.info.oo1._Ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LagartoTest {
	private Lagarto lagarto;
	
	@BeforeEach
	public void setUp() {
		lagarto = new Lagarto();
	}
	
	@Test
	public void testJugarContra() {
		assertEquals("Empate", lagarto.jugarContra(lagarto));
	}
	
	@Test
	public void testJugarContraPiedra() {
		assertEquals("Gana Piedra", lagarto.jugarContraPiedra());
	}

	@Test
	public void testJugarContraPapel() {
		assertEquals("Gana Lagarto", lagarto.jugarContraPapel());
	}

	@Test
	public void testJugarContraTijera() {
		assertEquals("Gana Tijera", lagarto.jugarContraTijera());
	}

	@Test
	public void testJugarContraLagarto() {
		assertEquals("Empate", lagarto.jugarContraLagarto());
	}

	@Test
	public void testJugarContraSpock() {
		assertEquals("Gana Lagarto", lagarto.jugarContraSpock());
	}

}
