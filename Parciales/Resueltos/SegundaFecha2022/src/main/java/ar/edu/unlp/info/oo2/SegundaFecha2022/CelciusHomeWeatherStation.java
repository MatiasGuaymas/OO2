package ar.edu.unlp.info.oo2.SegundaFecha2022;

public class CelciusHomeWeatherStation extends HomeWeatherStation {
	public CelciusHomeWeatherStation(double temperaturaFarenheit, double presion, double radiacionSolar) {
		super(temperaturaFarenheit, presion, radiacionSolar);
	}

	private double toCelcius(double temp) {
		return (temp-32) / 1.8;
	}
	
	public double getTemperaturaCelcius() {
		return this.toCelcius(this.getTemperaturaFarenheit());
	}
	
	public double getPromedioCelcius() {
		return this.getTemperaturasFarenheit().stream().mapToDouble(temp -> this.toCelcius(temp)).average().orElse(0);
	}
	
	public String displayData() {
		return "";
	}
	
	public double getPromedioFarenheit() {
		return this.getTemperaturasFarenheit().stream().mapToDouble(temp -> temp).average().orElse(0);
	}
	
}
