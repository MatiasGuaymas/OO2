package ar.edu.unlp.info.oo1._Ejercicio1;

public class Retweet implements Publicacion{
	private Tweet tweetOrigen;
	
	public Retweet (Tweet tweetOrigen) {
		this.tweetOrigen = tweetOrigen;
	}
	
	public String getTexto() {
		return this.tweetOrigen.getTexto();
	}
	
	public Tweet getTweetOrigen() {
		return this.tweetOrigen;
	}
	
	public boolean esRetweet() {
		return true;
	}

}
