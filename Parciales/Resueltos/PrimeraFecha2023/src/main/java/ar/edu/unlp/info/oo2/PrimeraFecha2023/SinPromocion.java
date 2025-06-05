package ar.edu.unlp.info.oo2.PrimeraFecha2023;

import java.util.List;

public class SinPromocion implements Promocion {

	@Override
	public double calcularMontoConDescuento(List<Seguro> seguros) {
		return seguros.stream()
                .mapToDouble(s -> s.getPrecioFinal())
                .sum();
	}

}
