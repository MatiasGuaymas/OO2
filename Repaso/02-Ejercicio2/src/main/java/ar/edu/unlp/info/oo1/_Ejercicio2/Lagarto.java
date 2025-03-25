package ar.edu.unlp.info.oo1._Ejercicio2;

public class Lagarto implements Jugada{
	public Lagarto() {}

	@Override
	public String jugarContra(Jugada jugada) {
		return jugada.jugarContraLagarto();
	}

	@Override
	public String jugarContraPiedra() {
		return "Gana Piedra";
	}

	@Override
	public String jugarContraPapel() {
		return "Gana Lagarto";
	}

	@Override
	public String jugarContraTijera() {
		return "Gana Tijera";
	}

	@Override
	public String jugarContraLagarto() {
		return "Empate";
	}

	@Override
	public String jugarContraSpock() {
		return "Gana Lagarto";
	}
}
