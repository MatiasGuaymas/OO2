package ar.edu.unlp.info.oo2.SegundaFecha2022;

public class PromCelciusDecorator extends WeatherDecorator{

	public PromCelciusDecorator(WeatherComponent wrappee) {
		super(wrappee);
	}
	
	@Override
	public String displayData() {
		return super.displayData() + " Promedio de temperaturas C:" + this.getPromedioCelcius();
	}


}
