package ar.edu.unlp.info.oo2.PrimeraFecha2023;

public class SeguroTercerosCompleto extends Seguro{

	@Override
	protected double adicionalSeguro() {
		return 5000;
	}

	@Override
	protected double adicionalCantidad() {
		return this.vehiculo.getCantMaxOcupantes();
	}

	@Override
	public double costoCoberturaDaños() {
		return this.vehiculo.calcularValorAntiguedad();
	}

	@Override
	protected double adicionalCobertura() {
		return 10000;
	}

}
