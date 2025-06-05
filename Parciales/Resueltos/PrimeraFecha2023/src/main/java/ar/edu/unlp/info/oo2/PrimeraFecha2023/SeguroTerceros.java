package ar.edu.unlp.info.oo2.PrimeraFecha2023;

public class SeguroTerceros extends Seguro{

	@Override
	protected double adicionalSeguro() {
		return 0;
	}

	@Override
	protected double adicionalCantidad() {
		return 0;
	}

	@Override
	public double costoCoberturaDaños() {
		return 1000 + this.calcularValorAuto(0.01);
	}

	@Override
	protected double adicionalCobertura() {
		return 0;
	}

}
