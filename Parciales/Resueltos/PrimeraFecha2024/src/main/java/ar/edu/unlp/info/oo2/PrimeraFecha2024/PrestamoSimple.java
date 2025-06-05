package ar.edu.unlp.info.oo2.PrimeraFecha2024;

public class PrestamoSimple extends Prestamo{
	private double interes;

	public PrestamoSimple(Cliente cliente, double montoSolicitado, int cantCuotas, double interes) {
		super(cliente, montoSolicitado, cantCuotas);
		this.interes = interes;
	}

	@Override
	protected double getTasaInteres() {
		return this.interes;
	}

}
