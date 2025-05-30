package ar.edu.unlp.info.oo2.rafecha2024;
import java.util.*;
public class Indec {
	
	public Indec() {
		// TODO Auto-generated constructor stub
	}
	
	public double getIndiceInflacion() {
		Random rand = new Random();
        
        // Generar un número aleatorio entre 0 y 1
        double random = rand.nextDouble();
        
        // Escalar y desplazar el número aleatorio para obtener el rango deseado (0.01 a 0.5)
        double min = 0.01;
        double max = 0.5;
        double randomInRange = min + (random * (max - min));
        return randomInRange;
	}
	

}
