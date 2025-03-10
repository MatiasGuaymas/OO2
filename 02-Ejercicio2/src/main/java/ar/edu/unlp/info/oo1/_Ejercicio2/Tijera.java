package ar.edu.unlp.info.oo1._Ejercicio2;

public class Tijera implements Jugada{
	public Tijera() {}

	@Override
	public String jugarContra(Jugada jugada) {
		return jugada.jugarContraTijera();
	}

	@Override
	public String jugarContraPiedra() {
		return "Gana Piedra";
	}

	@Override
	public String jugarContraPapel() {
		return "Gana Tijera";
	}

	@Override
	public String jugarContraTijera() {
		return "Empate";
	}

	@Override
	public String jugarContraLagarto() {
		return "Gana Tijera";
	}

	@Override
	public String jugarContraSpock() {
		return "Gana Spock";
	}
}
