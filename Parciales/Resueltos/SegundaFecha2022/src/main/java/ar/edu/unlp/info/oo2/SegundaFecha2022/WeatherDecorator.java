package ar.edu.unlp.info.oo2.SegundaFecha2022;

public abstract class WeatherDecorator implements WeatherComponent{
	private WeatherComponent wrappee;
	
	public WeatherDecorator(WeatherComponent wrappee) {
		this.wrappee = wrappee;
	}
	
	@Override
	public double getTemperaturaFarenheit() {
		return this.wrappee.getTemperaturaFarenheit();
	}

	@Override
	public double getPresion() {
		return this.wrappee.getPresion();
	}

	@Override
	public double getRadiacionSolar() {
		return this.wrappee.getRadiacionSolar();
	}

	@Override
	public double getPromedioFarenheit() {
		return this.wrappee.getPromedioFarenheit();
	}

	@Override
	public double getTemperaturaCelcius() {
		return this.wrappee.getTemperaturaCelcius();
	}

	@Override
	public double getPromedioCelcius() {
		return this.wrappee.getPromedioCelcius();
	}

	@Override
	public String displayData() {
		return this.wrappee.displayData();
	}
	
}
