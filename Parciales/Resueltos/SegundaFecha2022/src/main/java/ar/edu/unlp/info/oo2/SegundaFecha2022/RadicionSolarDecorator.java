package ar.edu.unlp.info.oo2.SegundaFecha2022;

public class RadicionSolarDecorator extends WeatherDecorator{

	public RadicionSolarDecorator(WeatherComponent wrappee) {
		super(wrappee);
	}

	@Override
	public String displayData() {
		return super.displayData() + " Radiación solar:" + this.getRadiacionSolar();
	}

}
