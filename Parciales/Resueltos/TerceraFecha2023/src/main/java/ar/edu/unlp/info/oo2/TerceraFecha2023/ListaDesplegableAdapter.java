package ar.edu.unlp.info.oo2.TerceraFecha2023;

public class ListaDesplegableAdapter implements ComponenteVisual{
	private ListaDesplegable lista;

	public ListaDesplegableAdapter(ListaDesplegable lista) {
		this.lista = lista;
	 }
	
	@Override
	public void aplicarEstilo(ConfiguracionDeEstilo estilo) {
		this.lista.setStyle(estilo.getEstiloEtiqueta());
	}

	@Override
	public String imprimir() {
		return this.lista.print();
	}

}
