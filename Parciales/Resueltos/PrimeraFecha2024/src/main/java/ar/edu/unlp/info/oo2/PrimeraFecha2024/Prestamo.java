package ar.edu.unlp.info.oo2.PrimeraFecha2024;

public abstract class Prestamo {
	private Cliente cliente;
	private double montoSolicitado;
	private int cantCuotas;
	private EstadoPrestamo estado;
	private int cantCuotasPagadas = 0;
	
	public Prestamo (Cliente cliente, double montoSolicitado, int cantCuotas) {
		this.cliente = cliente;
		this.montoSolicitado = montoSolicitado;
		this.cantCuotas = cantCuotas;
		/* if (cliente.superaSueldoDeclarado(this.calcularValorCuota()))
			this.estado = new Rechazado();
		else
			this.estado = new Aceptado(); */
	}
	
	protected abstract double getTasaInteres();
	
	public boolean prestamoEstaPagadoCompletamente() {
		return this.cantCuotas - this.cantCuotasPagadas == 0;
	}
	
	public double calcularValorCuota() {
		return (this.montoSolicitado / this.cantCuotas) * this.getTasaInteres();
	}
}
