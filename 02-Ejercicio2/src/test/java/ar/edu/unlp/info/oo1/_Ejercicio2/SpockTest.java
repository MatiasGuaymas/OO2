package ar.edu.unlp.info.oo1._Ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SpockTest {
	private Spock spock;
	private Papel papel;
	private Tijera tijera;
	private Piedra piedra;
	private Lagarto lagarto;
	
	@BeforeEach
	public void setUp() {
		spock = new Spock();
		papel = new Papel();
		tijera = new Tijera();
		piedra = new Piedra();
		lagarto = new Lagarto();
	}
	
	@Test
	public void testJugarContra() {
		assertEquals("Gana Papel", spock.jugarContra(papel));
		assertEquals("Gana Spock", spock.jugarContra(tijera));
		assertEquals("Gana Spock", spock.jugarContra(piedra));
		assertEquals("Gana Lagarto", spock.jugarContra(lagarto));
		assertEquals("Empate", spock.jugarContra(spock));
	}

}
