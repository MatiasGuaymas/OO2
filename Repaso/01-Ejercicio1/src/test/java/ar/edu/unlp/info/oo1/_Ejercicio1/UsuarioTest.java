package ar.edu.unlp.info.oo1._Ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
	private Usuario user;
	
	@BeforeEach 
	public void setUp() {
		this.user = new Usuario("Pancho");
	}
	
	@Test
	public void testPostearTweet() {
		assertNull(user.postearTweet(""));
		assertNotNull(user.postearTweet("A"));
		assertNotNull(user.postearTweet("Donde alguien ve arte, el otro nunca podrá ver lo contrario. Porque incluso el blanco y el vacío son formas de expresión. Incluso cuando sientes indiferencia ante algo que no consideras arte, es válido como tal, la expresión tiene libertad que no podemos encerrar ni condenar."));
		assertNull(user.postearTweet("Donde alguien ve arte, el otro nunca podrá ver lo contrario. Porque incluso el blanco y el vacío son formas de expresión. Incluso cuando sientes indiferencia ante algo que no consideras arte, es válido como tal, la expresión tiene libertad que no podemos encerrar ni condenar. NO CUMPLO!!!"));
	} 
	
	@Test
	public void testRepostearTweet() {
		Tweet tw = new Tweet("Matute on the kitchen");
		assertNotNull(user.repostearTweet(tw));
	}
	
	@Test
	public void testEliminarPublicaciones() {
		user.postearTweet("Juancito V1");
		user.postearTweet("Juancito V2");
		assertEquals(user.getPublicaciones().size(), 2);
		user.eliminarPublicaciones();
		assertEquals(user.getPublicaciones().size(), 0);
	}
}
