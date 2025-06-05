package ar.edu.unlp.info.oo2.PrimeraFecha2023;

import java.util.List;

public class MultiplesPolizas implements Promocion{

	@Override
	public double calcularMontoConDescuento(List<Seguro> seguros) {
		double factor = seguros.size() >= 2 ? 0.9 : 1.0;
        return seguros.stream()
                .mapToDouble(s -> s.getPrecioFinal() * factor)
                .sum();
	}

}
