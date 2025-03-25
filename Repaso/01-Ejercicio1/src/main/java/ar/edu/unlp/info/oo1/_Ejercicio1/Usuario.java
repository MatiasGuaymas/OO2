package ar.edu.unlp.info.oo1._Ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Usuario {
	private String screenName;
	private List <Publicacion> publicaciones;
	
	public Usuario (String screenName) {
		this.screenName = screenName;
		this.publicaciones = new ArrayList<Publicacion>();
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
	
	public String getScreenName() {
		return this.screenName;
	}
	
	public void eliminarPublicaciones() {
		this.publicaciones.clear();
	}
	
	public List<Publicacion> getPublicaciones() {
		return this.publicaciones;
	}
	
	public List<Tweet> getTweets() {
		return this.publicaciones.stream().filter(p -> !p.esRetweet()).map(p -> (Tweet) p).collect(Collectors.toList());
	}
	
	public void removerRetweets(List<Tweet> tweets) {
        this.publicaciones.removeIf(p -> p.esRetweet() && tweets.contains(((Retweet) p).getTweetOrigen()));
    }
}
