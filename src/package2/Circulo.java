package package2;

public class Circulo extends Figura{
	
	private double radio;
	
	public Circulo(double r){
		super();
		numeroDeLados = 1;
		radio = r;
		base=2*Math.PI*r;
	}
	
	public String toString(){
		return 	"Valores del Circulo \n" + 
				"----------------------\n" +
				"Base= " + base + "\n" +
				"Perimetro= " + perimetro() + "\n" + 
				"Numero de Lados = " + numeroDeLados + "\n" +
				"Figuras Totales= " + numeroDeFiguras;
	}
}
