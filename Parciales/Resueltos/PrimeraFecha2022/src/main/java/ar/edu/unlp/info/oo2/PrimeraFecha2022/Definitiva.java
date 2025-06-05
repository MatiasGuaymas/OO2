package ar.edu.unlp.info.oo2.PrimeraFecha2022;

public class Definitiva implements EstadoExcursion {

	@Override
	public void inscribir(Excursion excursion, Usuario unUsuario) {
		excursion.agregarAListaInscripcion(unUsuario);
		if (excursion.cantRestantesCupoMax() == 0)
			excursion.setState(new Completa());
	}

	@Override
	public String obtenerInformacion(Excursion excursion) {
		return excursion.infoMails() + excursion.cantRestantesCupoMax();
	}

}
