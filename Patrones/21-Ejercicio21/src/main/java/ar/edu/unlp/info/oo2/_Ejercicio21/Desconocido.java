package ar.edu.unlp.info.oo2._Ejercicio21;

import java.time.LocalDate;

public class Desconocido implements IMamifero {

	public String getIdentificador() {
		return null;
	}

	public String getEspecie() {
		return null;
	}
	
	public LocalDate getFechaNacimiento() {
		return null;
	}

	public IMamifero getPadre() {
		return null;
	}
	
	public IMamifero getMadre() {
		return null;
	}
	
	public Mamifero getAbueloMaterno() {
		return null;
	}

	public Mamifero getAbuelaMaterna() {
		return null;
	}

	public Mamifero getAbueloPaterno() {
		return null;
	}

	public Mamifero getAbuelaPaterna() {
		return null;
	}
	
	public void setIdentificador(String id) {}

	public void setEspecie(String especie) {}

	public void setFechaNacimiento(LocalDate fecha) {}

	public void setPadre(IMamifero padre) {}

	public void setMadre(IMamifero madre) {}

	public Boolean tieneComoAncestroA(IMamifero unMamifero) {
		return false;
	}

}
