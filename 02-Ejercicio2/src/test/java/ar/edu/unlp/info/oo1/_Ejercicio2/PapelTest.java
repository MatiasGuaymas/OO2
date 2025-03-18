package ar.edu.unlp.info.oo1._Ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PapelTest {
	private Papel papel;
	
	@BeforeEach
	public void setUp() {
		papel = new Papel();
	}
	
	@Test
	public void testJugarContra() {
		assertEquals("Empate", papel.jugarContra(papel));
	}
	
	@Test
	public void testJugarContraPiedra() {
		assertEquals("Gana Papel", papel.jugarContraPiedra());
	}

	@Test
	public void testJugarContraPapel() {
		assertEquals("Empate", papel.jugarContraPapel());
	}

	@Test
	public void testJugarContraTijera() {
		assertEquals("Gana Tijera", papel.jugarContraTijera());
	}

	@Test
	public void testJugarContraLagarto() {
		assertEquals("Gana Lagarto", papel.jugarContraLagarto());
	}

	@Test
	public void testJugarContraSpock() {
		assertEquals("Gana Papel", papel.jugarContraSpock());
	}

}
