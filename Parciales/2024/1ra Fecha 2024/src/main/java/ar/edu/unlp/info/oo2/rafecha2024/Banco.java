package ar.edu.unlp.info.oo2.rafecha2024;
import java.util.*;
public class Banco {
	
	private  double interesSimple; 
	private List<Cliente> clientes;
	private List<Prestamo> prestamos;
	
	public Banco(double interes) {
		this.clientes = new ArrayList<Cliente>();
		this.prestamos = new ArrayList<Prestamo>();
		this.interesSimple = interes;
		// TODO Auto-generated constructor stub
	}
	
	public Cliente altaCliente (String nombre, double sueldo) {
		Cliente cliente = new Cliente(nombre,sueldo);
		this.clientes.add(cliente);
		return cliente;
	}
	
	public Simple SolicitarPrestamoSimple(int cantCuotas, double monto, Cliente cliente) {
		Simple prestamoSimple = new Simple(cliente,monto,cantCuotas,interesSimple);
		this.prestamos.add(prestamoSimple);
		return prestamoSimple;
		
		
	}
	
	public UVA solicitarPrestamoUVA(int cantCuotas, double monto, Cliente cliente) {
		UVA prestamoUVA = new UVA(cliente,monto,cantCuotas);
		this.prestamos.add(prestamoUVA);
		return prestamoUVA;
	}
	
	
	

}
