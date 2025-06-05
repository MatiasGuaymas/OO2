package ar.edu.unlp.info.oo2.PrimeraFecha2024;

public class Cliente {
	private String nombre;
	private double salarioMensual;
	private final double porcentajeExigido = 0.3;
	
	public Cliente (String nombre, double salarioMensual) {
		this.nombre = nombre;
		this.salarioMensual = salarioMensual;
	}
	
	public boolean superaSueldoDeclarado (double cuota) {
		return cuota > this.salarioMensual * this.porcentajeExigido;
	}
		
}
