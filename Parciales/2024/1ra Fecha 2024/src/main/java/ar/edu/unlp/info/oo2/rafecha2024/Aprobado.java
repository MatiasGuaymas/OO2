package ar.edu.unlp.info.oo2.rafecha2024;

public class Aprobado implements Estado{
	
	@Override
	public void pagarCuota(Prestamo prestamo) {
		// TODO Auto-generated method stub
		prestamo.pagarCuota();
		if (prestamo.verificarFinDePago())
			prestamo.setEstado(new Finalizado());
	}
	@Override
	public double cancelarPrestamo(Prestamo prestamo) {
		// TODO Auto-generated method stub
		return prestamo.calcularGastosCancelacion();
	}

}
