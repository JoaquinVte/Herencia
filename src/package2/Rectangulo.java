package package2;

public class Rectangulo extends Figura{
	private double altura;
	
	public Rectangulo(double b,double a){
		base 			= b;
		altura 			= a;
		
		// Atributo de Figura
		numeroDeLados 	= 4;
	}
	
	public double perimetro(){
		return (base+altura)*2;
	}
	
	public String toString(){
		return 	"Valores del Triangulo\n" + 
				"----------------------\n" +
				"Base= " + base + "\n" +
				"Altura= " + altura + "\n" +
				"Perimetro= " + perimetro() + "\n" + 
				"Numero de Lados = " + numeroDeLados + "\n" +
				"Figuras Totales= " + numeroDeFiguras;
	}
}
