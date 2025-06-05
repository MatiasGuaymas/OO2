package ar.edu.unlp.info.oo2.PrimeraFecha2024;

public class PrestamoUVA extends Prestamo{

	public PrestamoUVA(Cliente cliente, double montoSolicitado, int cantCuotas) {
		super(cliente, montoSolicitado, cantCuotas);
	}

	@Override
	protected double getTasaInteres() {
		//return Indec.getIndiceInflacion();
		return 0.1;
	}

}
