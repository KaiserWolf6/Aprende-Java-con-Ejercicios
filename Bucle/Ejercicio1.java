/*
 * Muestra los numeros multiplos de 5 de 0  a 100
*/
public class Ejercicio1 {
	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) 
			if (i%5 == 0) 
				System.out.println(i);
	}
}