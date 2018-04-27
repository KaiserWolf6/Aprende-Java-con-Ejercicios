/**
 *Ejercicio 1 de variables del libro Aprende Java con Ejercicios
*/
public class Ejercicio1 {
	public static void main(String[] args) {
		int x = 144;
		int y = 999;
		int suma, resta, multi;
		double div;
		suma = x + y;
		resta = y - x;
		multi = x * y;
		div = (double)y / (double)x;
		System.out.println("El resultado de la suma es: " + suma);
		System.out.println("El resultado de la resta es: "  + resta);
		System.out.println("El resultado de la multi es: " + multi);
		System.out.println("El resultado de la div es: " + div);
	}
}