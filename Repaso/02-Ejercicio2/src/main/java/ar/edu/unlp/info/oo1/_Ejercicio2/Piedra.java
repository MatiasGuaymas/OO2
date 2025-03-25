package ar.edu.unlp.info.oo1._Ejercicio2;

public class Piedra implements Jugada{
	public Piedra() {}

	@Override
	public String jugarContra(Jugada jugada) {
		return jugada.jugarContraPiedra();
	}

	@Override
	public String jugarContraPiedra() {
		return "Empate";
	}

	@Override
	public String jugarContraPapel() {
		return "Gana Papel";
	}

	@Override
	public String jugarContraTijera() {
		return "Gana Piedra";
	}

	@Override
	public String jugarContraLagarto() {
		return "Gana Piedra";
	}

	@Override
	public String jugarContraSpock() {
		return "Gana Spock";
	}
	
	
}
