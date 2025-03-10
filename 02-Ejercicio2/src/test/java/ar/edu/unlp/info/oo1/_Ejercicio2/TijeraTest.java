package ar.edu.unlp.info.oo1._Ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TijeraTest {
	private Tijera tijera;
	private Papel papel;
	private Piedra piedra;
	private Lagarto lagarto;
	private Spock spock;
	
	@BeforeEach
	public void setUp() {
		tijera = new Tijera();
		papel = new Papel();
		piedra = new Piedra();
		lagarto = new Lagarto();
		spock = new Spock();
	}
	
	@Test
	public void testJugarContra() {
		assertEquals("Gana Tijera", tijera.jugarContra(papel));
		assertEquals("Empate", tijera.jugarContra(tijera));
		assertEquals("Gana Piedra", tijera.jugarContra(piedra));
		assertEquals("Gana Tijera", tijera.jugarContra(lagarto));
		assertEquals("Gana Spock", tijera.jugarContra(spock));
	}

}
