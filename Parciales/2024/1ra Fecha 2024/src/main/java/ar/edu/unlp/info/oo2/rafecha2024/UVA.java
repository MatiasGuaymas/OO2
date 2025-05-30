package ar.edu.unlp.info.oo2.rafecha2024;
import java.util.*;
public class UVA extends Prestamo {
	
	private List<Double>pagos;
	
	public UVA(Cliente cliente, double monto, int cant) {
		super(cliente,monto,cant);
		this.pagos = new ArrayList<Double>();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double retornarInteres() {
		// TODO Auto-generated method stub
		Indec indec = new Indec();
		double interes = indec.getIndiceInflacion();
		return interes;
	}
	
	@Override
	public void pagarCuota() {
		// TODO Auto-generated method stub
		this.pagos.add(this.calcularCuota());
	}
	
	@Override
	public double calcularMontoPagado() {
		// TODO Auto-generated method stub
		return this.pagos.stream().mapToDouble(Double::doubleValue).sum();
	}
	
	
	@Override
	public double retornarGastoSellado() {
		// TODO Auto-generated method stub
		return 0;
	}

}
