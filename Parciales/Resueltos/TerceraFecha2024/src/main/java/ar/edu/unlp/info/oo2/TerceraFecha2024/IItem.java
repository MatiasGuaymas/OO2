package ar.edu.unlp.info.oo2.TerceraFecha2024;

public abstract class IItem {
	private String nombre;
    private int espacioOcupado;

    public IItem(String nombre, int espacioOcupado) {
        this.nombre = nombre;
        this.espacioOcupado = espacioOcupado;
    }

    public abstract boolean agregarItem(IItem item);
    public abstract Bolsa buscarBolsaMasGrande();
    public abstract IItem buscarItem(String nombre);
    public abstract int capacidadDisponible();
    public abstract int getCapacidad();
    public abstract int getCapacidadDisponible();

    public int getEspacioOcupado() {
        return espacioOcupado;
    }

    public String getNombre() {
        return this.nombre;
    }
}
