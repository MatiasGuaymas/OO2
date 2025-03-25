package ar.edu.unlp.info.oo1._Ejercicio2;

public class Papel implements Jugada{
	
	public Papel() {}

	@Override
	public String jugarContra(Jugada jugada) {
		return jugada.jugarContraPapel();
	}

	@Override
	public String jugarContraPiedra() {
		return "Gana Papel";
	}

	@Override
	public String jugarContraPapel() {
		return "Empate";
	}

	@Override
	public String jugarContraTijera() {
		return "Gana Tijera";
	}

	@Override
	public String jugarContraLagarto() {
		return "Gana Lagarto";
	}

	@Override
	public String jugarContraSpock() {
		return "Gana Papel";
	}

}
