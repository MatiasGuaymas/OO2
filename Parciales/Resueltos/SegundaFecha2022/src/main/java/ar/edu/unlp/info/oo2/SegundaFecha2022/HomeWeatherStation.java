package ar.edu.unlp.info.oo2.SegundaFecha2022;

import java.util.ArrayList;
import java.util.List;

public class HomeWeatherStation {
	private double temperaturaFarenheit;
	private double presion;
	private double radiacionSolar;
	private List<Double> temperaturasFarenheit;
	
	public HomeWeatherStation(double temperaturaFarenheit, double presion, double radiacionSolar) {
		this.temperaturaFarenheit = temperaturaFarenheit;
		this.presion = presion;
		this.radiacionSolar = radiacionSolar;
		this.temperaturasFarenheit = new ArrayList<Double>();
	}

	public double getTemperaturaFarenheit() {
		return temperaturaFarenheit;
	}

	public double getPresion() {
		return presion;
	}

	public double getRadiacionSolar() {
		return radiacionSolar;
	}

	public List<Double> getTemperaturasFarenheit() {
		return temperaturasFarenheit;
	}

}
