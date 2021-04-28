package pack01;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contador fuente = new Contador(2000);
		ObservadorIncremento1 obs1 = new ObservadorIncremento1();
		ObservadorIncremento2 obs2 = new ObservadorIncremento2();
		
		fuente.agregarObservador(obs1);
		fuente.agregarObservador(obs2);
		
		while(fuente.getValor() < fuente.getValorMaximo()) {
			fuente.incrementaValor();
			System.out.println("Valor: " + fuente.getValor());
			System.out.println("Porcentaje 1: " + obs1.getPorcentaje());
			System.out.println("Porcentaje 2: " + obs2.getPorcentaje());
		}

	}

}
