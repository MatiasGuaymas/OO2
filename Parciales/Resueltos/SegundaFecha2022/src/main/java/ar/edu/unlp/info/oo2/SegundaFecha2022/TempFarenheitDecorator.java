package ar.edu.unlp.info.oo2.SegundaFecha2022;

public class TempFarenheitDecorator extends WeatherDecorator{

	public TempFarenheitDecorator(WeatherComponent wrappee) {
		super(wrappee);
	}

	@Override
	public String displayData() {
		return super.displayData() + " Temperatura F:" + this.getTemperaturaFarenheit();
	}

}
