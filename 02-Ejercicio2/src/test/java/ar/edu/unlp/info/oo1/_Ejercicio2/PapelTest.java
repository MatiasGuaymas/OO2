package ar.edu.unlp.info.oo1._Ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PapelTest {
	private Papel papel;
	private Tijera tijera;
	private Piedra piedra;
	private Lagarto lagarto;
	private Spock spock;
	
	@BeforeEach
	public void setUp() {
		papel = new Papel();
		tijera = new Tijera();
		piedra = new Piedra();
		lagarto = new Lagarto();
		spock = new Spock();
	}
	
	@Test
	public void testJugarContra() {
		assertEquals("Empate", papel.jugarContra(papel));
		assertEquals("Gana Tijera", papel.jugarContra(tijera));
		assertEquals("Gana Papel", papel.jugarContra(piedra));
		assertEquals("Gana Lagarto", papel.jugarContra(lagarto));
		assertEquals("Gana Papel", papel.jugarContra(spock));
	}

}
