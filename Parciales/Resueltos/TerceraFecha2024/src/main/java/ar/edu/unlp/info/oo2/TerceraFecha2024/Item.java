package ar.edu.unlp.info.oo2.TerceraFecha2024;

public class Item extends IItem{
	public Item(String nombre, int espacioOcupado) {
        super(nombre, espacioOcupado);
    }

    @Override
    public boolean agregarItem(IItem item) {
        return false;
    }

    @Override
    public Bolsa buscarBolsaMasGrande() {
        return null;
    }

    @Override
    public IItem buscarItem(String nombre) {
        return null;
    }

    @Override
    public int capacidadDisponible() {
        return 0;
    }

    @Override
    public int getCapacidad() {
        return 0;
    }

    @Override
    public int getCapacidadDisponible() {
        return 0;
    }
}
