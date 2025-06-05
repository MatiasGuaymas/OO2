package ar.edu.unlp.info.oo2.PrimeraFecha2024;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private double tasaInteres;
	private List<Cliente> clientes;
	private List<Prestamo> prestamos;
	
	public Banco (double tasaInteres) {
		this.tasaInteres = tasaInteres;
		this.clientes = new ArrayList<Cliente>();
		this.prestamos = new ArrayList<Prestamo>();
	}
	
	public void registrarCliente (Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	public PrestamoSimple solicitarPrestamoSimple (Cliente cliente, double monto, int cantCuotas) {
		PrestamoSimple prestamo = new PrestamoSimple(cliente, monto, cantCuotas, this.tasaInteres);
		this.prestamos.add(prestamo);
		return prestamo;
	}
	
	public PrestamoUVA solicitarPrestamoUVA (Cliente cliente, double monto, int cantCuotas) {
		PrestamoUVA prestamo = new PrestamoUVA(cliente, monto, cantCuotas);
		this.prestamos.add(prestamo);
		return prestamo;
	}
}
