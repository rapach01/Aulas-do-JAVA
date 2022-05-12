package geometria;

public interface Formas {
	
	default void perimeter(double lado1, double lado2, double lado3, double lado4 ) {
		double td;
		
		td = lado1 + lado2 + lado3 + lado4;
		
		perimeter(td);
	}

	default void perimetrocirc(double raio1) {
		
		raio1 = 2 * 3.14 * raio1;

	}
	
	default void periquad(double lado1) {
		
		lado1*=lado1;
		
		periquad(lado1);
	}
	
	default void periret (double lado1, double lado2) {
		double lado;
		
		lado = (lado1 *2) + (lado2 * 2);
		
		periret(lado);
	}

}
