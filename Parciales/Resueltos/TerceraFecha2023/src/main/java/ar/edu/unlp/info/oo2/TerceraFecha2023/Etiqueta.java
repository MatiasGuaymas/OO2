package ar.edu.unlp.info.oo2.TerceraFecha2023;

public class Etiqueta implements ComponenteVisual {
	private String texto;
	private String estiloActual;
	
	public Etiqueta(String texto) {
		this.texto = texto;
	}

	@Override
	public void aplicarEstilo(ConfiguracionDeEstilo estilo) {
		this.estiloActual = estilo.getEstiloEtiqueta();
	}
	@Override
	public String imprimir() {
		return "<etiqueta estilo=\"" + this.estiloActual + "\"> " + texto + " </etiqueta>";
	}
}
