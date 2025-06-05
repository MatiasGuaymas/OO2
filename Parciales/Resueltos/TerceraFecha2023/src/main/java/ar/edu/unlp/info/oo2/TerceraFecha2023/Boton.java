package ar.edu.unlp.info.oo2.TerceraFecha2023;

public class Boton implements ComponenteVisual {
	private String texto;
	private String accion;
	private String estiloActual;
	
	public Boton(String texto, String accion) {
		this.texto = texto;
		this.accion = accion;
	}

	@Override
	public void aplicarEstilo(ConfiguracionDeEstilo estilo) {
		this.estiloActual = estilo.getEstiloBoton();
	}

	@Override
	public String imprimir() {
		return "<boton estilo=\"" + this.estiloActual + "\" texto=\"" + texto + "\" accion=\"" + this.accion + "\"/>";
	}

}
