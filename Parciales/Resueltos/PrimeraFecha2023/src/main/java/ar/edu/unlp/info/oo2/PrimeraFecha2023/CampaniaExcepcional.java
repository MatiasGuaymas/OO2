package ar.edu.unlp.info.oo2.PrimeraFecha2023;

import java.util.List;

public class CampaniaExcepcional implements Promocion {

    @Override
    public double calcularMontoConDescuento(List<Seguro> seguros) {
        if (seguros.isEmpty()) return 0;

        double total = seguros.stream()
                             .mapToDouble(Seguro::getPrecioFinal)
                             .sum();

        double min = seguros.stream()
                           .mapToDouble(Seguro::getPrecioFinal)
                           .min()
                           .orElse(0);

        return total - (min * 0.5);
    }
}