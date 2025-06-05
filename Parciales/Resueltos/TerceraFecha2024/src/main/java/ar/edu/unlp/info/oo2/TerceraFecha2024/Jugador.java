package ar.edu.unlp.info.oo2.TerceraFecha2024;

public class Jugador {
	private String nombre;
    private Bolsa bolsa;

    public Jugador(String nombre, Bolsa bolsa) {
        this.nombre = nombre;
        this.bolsa = bolsa;
    }

    public boolean agregarItem(IItem item) {
        return bolsa.agregarItem(item);
    }

    public Bolsa buscarBolsaMasGrande() {
        return bolsa.buscarBolsaMasGrande();
    }

    public int capacidadDisponible() {
        return bolsa.capacidadDisponible();
    }
}
