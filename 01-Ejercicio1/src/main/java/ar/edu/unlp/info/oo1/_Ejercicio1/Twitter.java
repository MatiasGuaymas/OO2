package ar.edu.unlp.info.oo1._Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
	private List<Usuario> usuarios;
	
	public Twitter () {
		this.usuarios = new ArrayList<Usuario>();
	}
	
	public Usuario crearUsuario(String screenName) {
		Usuario u = null;
		if (!existeUsuario(screenName)) {
			u = new Usuario (screenName);
			this.usuarios.add(u);
		}
		return u;
	}
	
	private boolean existeUsuario (String screenName) {
		return this.usuarios.stream().anyMatch(usuario -> usuario.getScreenName().equals(screenName));
	}
	
	public Publicacion postearTweet (Usuario user, String texto) {
		return user.postearTweet(texto);
	}
	
	public Publicacion repostearTweet (Usuario user, Tweet tweetOrigen) {
		return user.repostearTweet(tweetOrigen);
	}
	
	public void eliminarUsuario (Usuario user) {
		user.eliminarPublicaciones();
		this.usuarios.remove(user);
	}
	
	public List<Usuario> getUsuarios() {
		return new ArrayList<Usuario>(usuarios);
	}
}
