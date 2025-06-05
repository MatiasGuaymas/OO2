package ar.edu.unlp.info.oo2.PrimeraFecha2023;

import java.util.ArrayList;
import java.util.List;

public class Persona {

	private int edad;
	private List <Seguro> seguros;
	private Promocion promocion;
	
	public Persona(int edad, Promocion promocion) {
		this.edad = edad;
		this.seguros = new ArrayList<Seguro>();
		this.promocion = promocion;
	}
	
	public double costoSeguro() {
		return this.edad * 100;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void agregarSeguro (Seguro seguro) {
		this.seguros.add(seguro);
	}
	
	public void setStrategy (Promocion promocion) {
		this.promocion = promocion;
	}
	
	public double calcularMontoAAbonar() {
		return this.promocion.calcularMontoConDescuento(this.seguros);
	}
	
}
