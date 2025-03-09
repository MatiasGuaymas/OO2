package ar.edu.unlp.info.oo1._Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String screenName;
	private List <Publicacion> publicaciones;
	
	public Usuario (String screenName) {
		this.screenName = screenName;
		this.publicaciones = new ArrayList<Publicacion>();
	}
	
	public String getScreenName() {
		return this.screenName;
	}
	
	public Publicacion postearTweet(String texto) {
		Publicacion tweet = null;
		if (this.cumpleLongitud(texto)) {
			tweet = new Tweet(texto);
			this.publicaciones.add(tweet);
		}
		return tweet;
	}
	
	private boolean cumpleLongitud (String texto) {
		return texto.length() >= 1 && texto.length() <= 280;
	}
	
	public Publicacion repostearTweet(Tweet tweetOrigen) {
		Retweet ret = new Retweet(tweetOrigen);
		this.publicaciones.add(ret);
		return ret;
	}
	
	public void eliminarPublicaciones() {
		this.publicaciones.clear();
	}
	
	public List<Publicacion> getPublicaciones() {
		return this.publicaciones;
	}
}
