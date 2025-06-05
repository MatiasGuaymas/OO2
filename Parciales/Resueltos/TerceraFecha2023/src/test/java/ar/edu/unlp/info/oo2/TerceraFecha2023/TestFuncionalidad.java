package ar.edu.unlp.info.oo2.TerceraFecha2023;

public class TestFuncionalidad {
	public static void main(String args []) {
		Contenedor cont = new Contenedor();
		cont.agregar(new Boton("Aceptar", "accept()"));
		cont.agregar(new Etiqueta("Parcial de Objetos"));

		ConfiguracionDeEstilo estilo = new ConfiguracionDeEstilo() {
		    public String getEstiloBoton() {
		        return "color:red; text-size:10px;";
		    }

		    public String getEstiloEtiqueta() {
		        return "color:blue; text-size:12px;";
		    }
		};

		cont.aplicarEstilo(estilo);
		System.out.println(cont.imprimir());
	}
}
