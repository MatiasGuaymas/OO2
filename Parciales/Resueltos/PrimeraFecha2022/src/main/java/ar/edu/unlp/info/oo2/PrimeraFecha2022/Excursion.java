package ar.edu.unlp.info.oo2.PrimeraFecha2022;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion {
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private String puntoEncuentro;
	private double costo;
	private int cupoMinimo;
	private int cupoMaximo;
	private EstadoExcursion estado;
	private List<Usuario> listaInscripcion;
	private List<Usuario> listaEspera;
	
	public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String puntoEncuentro, double costo,
			int cupoMinimo, int cupoMaximo) {
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.puntoEncuentro = puntoEncuentro;
		this.costo = costo;
		this.cupoMinimo = cupoMinimo;
		this.cupoMaximo = cupoMaximo;
		this.estado = new Provisoria();
		this.listaInscripcion = new ArrayList<Usuario>();
		this.listaEspera = new ArrayList<Usuario>();
	}
	
	public void inscribir (Usuario unUsuario) {
		this.estado.inscribir(this, unUsuario);
	}
	
	public String obtenerInformacion() {
		return this.nombre + " " + this.costo + " " + this.fechaInicio + " " + this.fechaFin + " " + this.puntoEncuentro + " " + this.estado.obtenerInformacion(this);
	}
	
	public int cantRestantesCupoMin() {
		return cupoMinimo - this.listaInscripcion.size();
	}
	
	public int cantRestantesCupoMax() {
		return cupoMaximo - this.listaInscripcion.size();
	}
	
	public String infoMails() {
		StringBuilder mails = new StringBuilder();
		this.listaInscripcion.stream()
			.forEach(usuario -> mails.append(usuario.getEmail()).append("\n"));
		return mails.toString();
	}
	
	public void agregarAListaInscripcion(Usuario unUsuario) {
		this.listaInscripcion.add(unUsuario);
	}
	
	public void agregarAListaEspera(Usuario unUsuario) {
		this.listaEspera.add(unUsuario);
	}
	
	public void setState(EstadoExcursion estado) {
		this.estado = estado;
	}
} 
