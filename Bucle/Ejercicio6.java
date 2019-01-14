/*
 * Muestra los numeros del 320 al 160, contando de 20 en 20 hacia atras
*/
public class Ejercicio6 {
	public static void main(String[] args) {
		int i = 340;
		do {
			i--;
			if (i%20 == 0)
				System.out.println(i);
		} while(i >= 160);
	}
}