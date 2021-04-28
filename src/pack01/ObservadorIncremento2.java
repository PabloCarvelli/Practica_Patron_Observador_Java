package pack01;

public class ObservadorIncremento2 implements ControlValorListener {
	
	private double porcentaje;
	private int incremento = 0;
	
	@Override
	public void fuenteIncrementada(ValorIncrementadoEvento evento) {
		incremento += evento.getIncremento();
		if(incremento >= 20) {
			porcentaje = evento.getSource().getValor() * 100.0 / evento.getSource().getValorMaximo();
			incremento = 0;
		}
	}

	public double getPorcentaje() {
		return porcentaje;
	}
	
	@Override
	public String toString() {
		return (porcentaje + "%");
	}
}
