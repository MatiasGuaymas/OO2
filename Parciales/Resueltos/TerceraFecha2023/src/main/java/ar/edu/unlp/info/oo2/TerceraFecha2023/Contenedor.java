package ar.edu.unlp.info.oo2.TerceraFecha2023;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Contenedor implements ComponenteVisual {
	private List<ComponenteVisual> components;
	
	public Contenedor() {
		this.components = new ArrayList<ComponenteVisual>();
	}

	public void agregar(ComponenteVisual component) {
        this.components.add(component);
    }
	
	@Override
	public void aplicarEstilo(ConfiguracionDeEstilo estilo) {
	    this.components.stream().forEach(c -> c.aplicarEstilo(estilo));
	}

	@Override
	public String imprimir() {
	    String contenido = this.components.stream()
	        .map(c -> c.imprimir())
	        .collect(Collectors.joining("\n"));

	    return "<contenedor>\n" + contenido + "\n</contenedor>";
	}
 }
