package pack01;

public class ObservadorIncremento1 implements ControlValorListener {
	
	private double porcentaje;
	
	@Override
	public void fuenteIncrementada(ValorIncrementadoEvento evento) {
		porcentaje = evento.getSource().getValor() * 100.0 / evento.getSource().getValorMaximo();
	}
	
	public double getPorcentaje() {
		return porcentaje;
	}
	
	@Override
	public String toString() {
		return (porcentaje + "%");
	}

}
