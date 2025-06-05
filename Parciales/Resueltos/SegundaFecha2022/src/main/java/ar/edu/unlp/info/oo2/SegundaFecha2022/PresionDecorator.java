package ar.edu.unlp.info.oo2.SegundaFecha2022;

public class PresionDecorator extends WeatherDecorator {

	public PresionDecorator(WeatherComponent wrappee) {
		super(wrappee);
	}
	
	@Override
	public String displayData() {
		return super.displayData() + " Presión atmosférica:" + this.getPresion();
	}

}
