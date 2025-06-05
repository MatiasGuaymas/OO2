package ar.edu.unlp.info.oo2.TerceraFecha2022;

public abstract class Estado {
	
	public void aprobarEtapa(Proyecto proy) throws Exception {}
	
	public void modificarMargenDeGanancia(Proyecto proy, double nuevoMargen) {}
	
	public void cancelarProyecto(Proyecto proy) {
		proy.setObjetivo("Cancelado");
	}
}
