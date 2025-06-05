package ar.edu.unlp.info.oo2.TerceraFecha2022;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Proyecto {
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String objetivo;
	private double margen;
	private int numeroIntegrantes;
	private double montoPorIntegrantes;
	private Estado estado;
	
	public Proyecto(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String objetivo, double margen, int numeroIntegrantes, double montoPorIntegrantes) {
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.objetivo = objetivo;
		this.margen = margen; // 7% = 0.07
		this.numeroIntegrantes = numeroIntegrantes;
		this.montoPorIntegrantes = montoPorIntegrantes;
		this.estado = new EnConstruccion();
	}
	
	public void setEstado(Estado est) {
		this.estado = est;
	}
	
	public void aprobarEtapa() throws Exception {
		this.estado.aprobarEtapa(this);
	}

	public double costoDelProyecto() {
		return this.numeroIntegrantes * this.montoPorIntegrantes * ChronoUnit.DAYS.between(fechaInicio, fechaFin);
	}
	
	public double precioDelProyecto() {
		return this.costoDelProyecto() * this.margen;
	}
	
	public void modificarMargenDeGanancia(double nuevoMargen) {
		this.estado.modificarMargenDeGanancia(this, nuevoMargen);
	}
	
	public double getMargen() {
		return this.margen;
	}
	
	public void setMargen(double margen) {
		this.margen = margen;
	}
	
	public void setObjetivo(String obj) {
		this.objetivo = obj;
	}
	
	
	
}
