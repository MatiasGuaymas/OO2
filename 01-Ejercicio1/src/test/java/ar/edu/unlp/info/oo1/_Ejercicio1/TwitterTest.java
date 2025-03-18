package ar.edu.unlp.info.oo1._Ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwitterTest {
	private RepositorioDeUsuarios twitter;
	private Usuario user;
	
	@BeforeEach
	public void setUp() {
		twitter = new RepositorioDeUsuarios();
		user = twitter.crearUsuario("Juan");
	}
	
	@Test
	public void testCrearUsuario() {
		assertNotNull(twitter.crearUsuario("Lola"));
		assertNull(twitter.crearUsuario("Lola"));
		assertEquals(twitter.getUsuarios().size(), 2);
	}
	
	@Test
	public void testEliminarUsuario() {
		twitter.eliminarUsuario(user);
		assertEquals(twitter.getUsuarios().size(), 0);
	}
	
}
