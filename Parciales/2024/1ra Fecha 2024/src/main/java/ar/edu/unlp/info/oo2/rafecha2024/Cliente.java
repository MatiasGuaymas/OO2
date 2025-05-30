package ar.edu.unlp.info.oo2.rafecha2024;

public class Cliente {
	private final double porcentajeExigido = 0.3;
	private String nombre;
	private double sueldo;
	
	public Cliente(String nombre, double sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		
		// TODO Auto-generated constructor stub
	}
	
	public boolean verificarSalarioSuficiente(double monto) {
		return monto > this.sueldo*this.porcentajeExigido;
	}

}
