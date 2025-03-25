package ar.edu.unlp.info.oo1._Ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SpockTest {
	private Spock spock;
	
	@BeforeEach
	public void setUp() {
		spock = new Spock();
	}
	
	@Test
	public void testJugarContra() {
		assertEquals("Empate", spock.jugarContra(spock));
	}
	
	@Test
	public void testJugarContraPiedra() {
		assertEquals("Gana Spock", spock.jugarContraPiedra());
	}

	@Test
	public void testJugarContraPapel() {
		assertEquals("Gana Papel", spock.jugarContraPapel());
	}

	@Test
	public void testJugarContraTijera() {
		assertEquals("Gana Spock", spock.jugarContraTijera());
	}

	@Test
	public void testJugarContraLagarto() {
		assertEquals("Gana Lagarto", spock.jugarContraLagarto());
	}

	@Test
	public void testJugarContraSpock() {
		assertEquals("Empate", spock.jugarContraSpock());
	}

}
