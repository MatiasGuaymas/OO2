package ar.edu.unlp.info.oo2.PrimeraFecha2022;

public class Provisoria implements EstadoExcursion {

	@Override
	public void inscribir(Excursion excursion, Usuario unUsuario) {
		excursion.agregarAListaInscripcion(unUsuario);
		if (excursion.cantRestantesCupoMin() == 0) 
			excursion.setState(new Definitiva());
	}

	@Override
	public String obtenerInformacion(Excursion excursion) {
		return Integer.toString(excursion.cantRestantesCupoMin());
	}

}
