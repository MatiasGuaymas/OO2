package ar.edu.unlp.info.oo1._Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeUsuarios {
	private List<Usuario> usuarios;
	
	public RepositorioDeUsuarios () {
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
	
	public void eliminarUsuario (Usuario user) {
		if (user!= null && existeUsuario(user.getScreenName())) {
			List <Tweet> lisTweets = user.getTweets(); 
			this.usuarios.stream().forEach(u -> u.removerRetweets(lisTweets));
			user.eliminarPublicaciones();
			this.usuarios.remove(user);
		}
	}
	
	public List<Usuario> getUsuarios() {
		return new ArrayList<Usuario>(usuarios);
	}
}
