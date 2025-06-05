package ar.edu.unlp.info.oo2.PrimeraFecha2023;

public abstract class Seguro {
	protected Vehiculo vehiculo;
	
	// Podría entenderse que se suma el adicional y a todo se le multiplica lo restante.
	public double costoSeguro() {
		return vehiculo.costoSeguro() + (this.adicionalSeguro() * this.adicionalCantidad());
	}
	
	protected abstract double adicionalSeguro();
	protected abstract double adicionalCantidad();
	
	public abstract double costoCoberturaDaños();
	
	protected double calcularValorAuto (double porcentaje) {
		return this.vehiculo.getValor() * porcentaje;
	}
	
	public double costoCoberturaDestruccionTotal() {
		return this.calcularValorAuto(0.05) + this.adicionalCobertura();
	}
	
	protected abstract double adicionalCobertura();
	
	public double getPrecioFinal() {
		return this.costoSeguro() + this.costoCoberturaDaños() + this.costoCoberturaDestruccionTotal();
	}
}
