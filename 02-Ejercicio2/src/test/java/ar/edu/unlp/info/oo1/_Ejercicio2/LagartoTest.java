package ar.edu.unlp.info.oo1._Ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LagartoTest {
	private Lagarto lagarto;
	private Papel papel;
	private Tijera tijera;
	private Piedra piedra;
	private Spock spock;
	
	@BeforeEach
	public void setUp() {
		lagarto = new Lagarto();
		papel = new Papel();
		tijera = new Tijera();
		piedra = new Piedra();
		spock = new Spock();
	}
	
	@Test
	public void testJugarContra() {
		assertEquals("Gana Lagarto", lagarto.jugarContra(papel));
		assertEquals("Gana Tijera", lagarto.jugarContra(tijera));
		assertEquals("Gana Piedra", lagarto.jugarContra(piedra));
		assertEquals("Empate", lagarto.jugarContra(lagarto));
		assertEquals("Gana Lagarto", lagarto.jugarContra(spock));
	}

}
