package ar.edu.unlp.info.oo2.rafecha2024;

public class Finalizado implements Estado{
	
	@Override
	public void pagarCuota(Prestamo prestamo) {
		// TODO Auto-generated method stub
		throw new Error ("El prestamo esta finalizado, no se puede pagar mas cuotas");
		
	}
	
	@Override
	public double cancelarPrestamo(Prestamo prestamo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
