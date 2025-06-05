package ar.edu.unlp.info.oo2.SegundaFecha2022;

public class PromFarenheitDecorator extends WeatherDecorator{

	public PromFarenheitDecorator(WeatherComponent wrappee) {
		super(wrappee);
	}
	
	@Override
	public String displayData() {
		return super.displayData() + " Promedio de temperaturas F:" + this.getPromedioFarenheit();
	}


}
