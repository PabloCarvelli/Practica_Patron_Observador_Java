package pack01;

import java.util.*;

public class ValorIncrementadoEvento extends EventObject {
	
	private int incremento = 0;
	
	public ValorIncrementadoEvento(Contador o, int incremento) {
		super (o);
		this.incremento = incremento;
	}
	
	@Override
	public Contador getSource() {
		return (Contador) super.getSource();
	}
	
	public int getIncremento() {
		return incremento;
	}

}
