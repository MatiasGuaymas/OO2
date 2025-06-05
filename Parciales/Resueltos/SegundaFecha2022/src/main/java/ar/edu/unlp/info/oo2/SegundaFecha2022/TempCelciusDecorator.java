package ar.edu.unlp.info.oo2.SegundaFecha2022;

public class TempCelciusDecorator extends WeatherDecorator {

	public TempCelciusDecorator(WeatherComponent wrappee) {
		super(wrappee);
	}
	
	@Override
	public String displayData() {
		return super.displayData() + " Temperatura C:" + this.getTemperaturaCelcius();
	}


}
