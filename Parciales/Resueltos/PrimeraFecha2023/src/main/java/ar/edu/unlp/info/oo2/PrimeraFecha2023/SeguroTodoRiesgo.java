package ar.edu.unlp.info.oo2.PrimeraFecha2023;

public class SeguroTodoRiesgo extends Seguro{

	@Override
	protected double adicionalSeguro() {
		return 9000;
	}

	@Override
	protected double adicionalCantidad() {
		return this.vehiculo.getAntiguedad();
	}

	@Override
	public double costoCoberturaDaños() {
		return 100000 / this.vehiculo.getEdadConductor();
	}

	@Override
	protected double adicionalCobertura() {
		return 1000 * this.vehiculo.getAntiguedad();
	}
	
	

}
