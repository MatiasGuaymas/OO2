package ar.edu.unlp.info.oo1._Ejercicio2;

public class Spock implements Jugada{
	public Spock() {}

	@Override
	public String jugarContra(Jugada jugada) {
		return jugada.jugarContraSpock();
	}

	@Override
	public String jugarContraPiedra() {
		return "Gana Spock";
	}

	@Override
	public String jugarContraPapel() {
		return "Gana Papel";
	}

	@Override
	public String jugarContraTijera() {
		return "Gana Spock";
	}

	@Override
	public String jugarContraLagarto() {
		return "Gana Lagarto";
	}

	@Override
	public String jugarContraSpock() {
		return "Empate";
	}
}
