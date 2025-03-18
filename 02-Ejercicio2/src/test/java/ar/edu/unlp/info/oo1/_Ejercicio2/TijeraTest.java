package ar.edu.unlp.info.oo1._Ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TijeraTest {
	private Tijera tijera;
	
	@BeforeEach
	public void setUp() {
		tijera = new Tijera();
	}
	
	@Test
	public void testJugarContra() {
		assertEquals("Empate", tijera.jugarContra(tijera));
	}
	
	@Test
	public void testJugarContraPiedra() {
		assertEquals("Gana Piedra", tijera.jugarContraPiedra());
	}

	@Test
	public void testJugarContraPapel() {
		assertEquals("Gana Tijera", tijera.jugarContraPapel());
	}

	@Test
	public void testJugarContraTijera() {
		assertEquals("Empate", tijera.jugarContraTijera());
	}

	@Test
	public void testJugarContraLagarto() {
		assertEquals("Gana Tijera", tijera.jugarContraLagarto());
	}

	@Test
	public void testJugarContraSpock() {
		assertEquals("Gana Spock", tijera.jugarContraSpock());
	}

}
