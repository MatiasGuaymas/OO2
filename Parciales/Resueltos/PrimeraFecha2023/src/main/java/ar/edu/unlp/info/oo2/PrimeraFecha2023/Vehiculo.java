package ar.edu.unlp.info.oo2.PrimeraFecha2023;

public class Vehiculo {
	private int cantMaxOcupantes;
	private int antiguedad;
	private double valor;
	private Persona conductor;
	
	public double costoSeguro() {
		return conductor.costoSeguro();
	}
	
	public int getCantMaxOcupantes() {
		return this.cantMaxOcupantes;
	}
	
	public int getAntiguedad() {
		return this.antiguedad;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public double calcularValorAntiguedad() {
		if (this.antiguedad > 4)
			return 4000 * antiguedad;
		return 10000;
	}
	
	public int getEdadConductor() {
		return conductor.getEdad();
	}
}
