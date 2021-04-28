package pack01;

import java.util.*;

public class Contador {
	
	private ArrayList<ControlValorListener> listeners = new ArrayList();
	
	private int valorMaximo = 1000;
	
	private int valor = 0;
	
	public Contador() {
		
	}
	
	public Contador(int valorMaximo) {
		this.valorMaximo = valorMaximo;
	}
	
	public void incrementaValor() {
		if(valor < valorMaximo)  {
			valor++;
			if(valor % 5 == 0) {
				notificaIncremento();
			}
		}
	}
	
	public int getValorMaximo() {
		return valorMaximo;
	}
	
	public int getValor() {
		return valor;
	}
	
	public void agregarObservador(ControlValorListener ctrl) {
		listeners.add(ctrl);
	}
	
	public void eliminarObservador(ControlValorListener ctrl) {
		listeners.remove(ctrl);
	}
	
	private void notificaIncremento() {
		ValorIncrementadoEvento evento = new ValorIncrementadoEvento(this, 5);
		for(ControlValorListener x: listeners) {
			x.fuenteIncrementada(evento);
		}
	}

}
