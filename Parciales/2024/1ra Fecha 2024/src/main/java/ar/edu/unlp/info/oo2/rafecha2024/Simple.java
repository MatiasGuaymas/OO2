package ar.edu.unlp.info.oo2.rafecha2024;

public class Simple extends Prestamo{
	
	private double interes;
	private int cuotasPagadas;
	
	public Simple(Cliente cliente, double monto, int cuotas, double interes) {
		super(cliente,monto,cuotas);
		this.interes = interes;
		this.cuotasPagadas = 0;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void pagarCuota() {
		this.cuotasPagadas++;
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public double retornarInteres() {
		// TODO Auto-generated method stub
		return this.interes;
	}
	
	@Override
	public double calcularMontoPagado() {
		// TODO Auto-generated method stub
		return this.cuotasPagadas*this.calcularCuota();
	}
	

	
	@Override
	public double retornarGastoSellado() {
		// TODO Auto-generated method stub
		return 5000;
	}
	
	
	

}
