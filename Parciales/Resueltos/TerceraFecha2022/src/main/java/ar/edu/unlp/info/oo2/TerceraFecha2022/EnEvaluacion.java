package ar.edu.unlp.info.oo2.TerceraFecha2022;

public class EnEvaluacion extends Estado {

	@Override
	public void aprobarEtapa(Proyecto proy) {
		proy.setEstado(new Confirmado());
	}
	
	@Override
	public void modificarMargenDeGanancia(Proyecto proy, double nuevoMargen) {
		if(proy.getMargen() > 0.11 && proy.getMargen() < 0.15) {
			proy.setMargen(nuevoMargen);
		}
	}
	
}
