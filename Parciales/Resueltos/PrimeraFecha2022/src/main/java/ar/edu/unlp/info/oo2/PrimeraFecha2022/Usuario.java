package ar.edu.unlp.info.oo2.PrimeraFecha2022;

public class Usuario {
	private String nombre;
	private String apellido;
	private String email;
	
	public Usuario(String nombre, String apellido, String email) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}
	
	public String getEmail() {
		return this.email;
	}
}
