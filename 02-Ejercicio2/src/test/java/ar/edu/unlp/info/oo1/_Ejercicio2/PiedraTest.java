package ar.edu.unlp.info.oo1._Ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PiedraTest {
	private Piedra piedra;
	private Tijera tijera;
	private Papel papel;
	private Lagarto lagarto;
	private Spock spock;
	
	@BeforeEach
	public void setUp() {
		piedra = new Piedra();
		papel = new Papel();
		tijera = new Tijera();
		lagarto = new Lagarto();
		spock = new Spock();
	}
	
	@Test
	public void testJugarContra() {
		assertEquals("Gana Papel", piedra.jugarContra(papel));
		assertEquals("Gana Piedra", piedra.jugarContra(tijera));
		assertEquals("Empate", piedra.jugarContra(piedra));
		assertEquals("Gana Piedra", piedra.jugarContra(lagarto));
		assertEquals("Gana Spock", piedra.jugarContra(spock));
	}

}
