package package2;

import miLibreria.Entrada;
import package1.Cuadrado;
import package1.Triangulo;

public class EjemploHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Entrada entrada = new Entrada();
		Circulo circulo;
		Rectangulo rectangulo;

		System.out.println("Introduccion de los datos del Circulo");
		circulo = new Circulo(entrada.obtenerFloat("Dame el radio"));

		System.out.println(circulo.toString());

		System.out.println("Introduccion de los datos del Rectangulo");
		rectangulo = new Rectangulo(entrada.obtenerFloat("Dame la base"),entrada.obtenerFloat("Dame la altura"));

		System.out.println(rectangulo.toString());
		System.out.println();
		System.out.println(circulo.toString());




	}

}
