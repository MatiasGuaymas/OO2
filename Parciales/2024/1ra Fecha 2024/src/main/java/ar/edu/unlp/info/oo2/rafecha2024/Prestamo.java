package ar.edu.unlp.info.oo2.rafecha2024;

public abstract class Prestamo {
	
	private Cliente cliente;
	private double monto;
	private int cuotas;
	private Estado estado;
	
	public Prestamo(Cliente cliente, double monto, int cuotas) {
		this.cliente = cliente;
		this.monto = monto;
		this.cuotas = cuotas;
		if (cliente.verificarSalarioSuficiente(this.calcularCuota()))
			this.setEstado(new Rechazado());
		else
			this.setEstado(new Aprobado());
		// TODO Auto-generated constructor stub
	}

	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public double getMonto() {
		return monto;
	}
	
	public abstract double retornarInteres(); //PRIMITIVE OPERATION
	
	
	
	public double calcularCuota() { //TEMPLATE METHOD
		return (this.monto/cuotas)*this.retornarInteres();
	}
	
	
	public void registrarPagoCuota() {
		estado.pagarCuota(this);
		
	}
	
	public void registrarCancelacionPrestamo() {
		estado.cancelarPrestamo(this);
	}
	
	public abstract double retornarGastoSellado(); //PRIMITIVE OPERATION
	
	public double calcularGastosAdministrativos() {//TEMPLATE METHOD??
		return this.calcularMontoRestante()*0.1 + this.retornarGastoSellado();
	}
	
	public double calcularGastosCancelacion() {
		return this.calcularMontoRestante() + this.calcularGastosAdministrativos();
	}
	
public boolean verificarFinDePago() {
		return this.calcularMontoRestante() == 0;
	}
	
	public abstract void pagarCuota();
	
	public abstract double calcularMontoPagado(); //PRIMITIVE OPERATION
	
	public  double calcularMontoRestante() { //TEMPLATE METHOD
		return this.monto - this.calcularMontoPagado();
	}
	

}
