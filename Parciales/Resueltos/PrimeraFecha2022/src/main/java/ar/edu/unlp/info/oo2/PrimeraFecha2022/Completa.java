package ar.edu.unlp.info.oo2.PrimeraFecha2022;

public class Completa implements EstadoExcursion{

	@Override
	public void inscribir(Excursion excursion, Usuario unUsuario) {
		excursion.agregarAListaEspera(unUsuario);
	}

	@Override
	public String obtenerInformacion(Excursion excursion) {
		return "";
	}

}
