package package2;

public abstract class Figura {
	// Cantidad de figuras creadas
	protected static int numeroDeFiguras = 0;
	
	// Cantidad de lados de la figura
	protected int numeroDeLados;
	
	// Longitud de lados de la base
	protected double base;
	
	protected Figura(){
		numeroDeFiguras++;
	}
	
	protected double perimetro(){
		return numeroDeLados*base;
	}
	
	
}
