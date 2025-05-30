package ar.edu.unlp.info.oo2.rafecha2024;

public class Rechazado implements Estado {
	
	@Override
	public void pagarCuota(Prestamo prestamo) {
		// TODO Auto-generated method stub
		throw new Error ("El prestamo esta rechazado, no se puede pagar cuota");
		
	}
	
	@Override
	public double cancelarPrestamo(Prestamo prestamo) {
		// TODO Auto-generated method stub
		throw new Error ("Prestamo rechazado, no se puede cancelar");
	}

}
