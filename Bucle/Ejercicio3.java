/*
 * Muestra los numeros multiplos de 5 de 0  a 100
*/
public class Ejercicio3 {
	public static void main(String[] args) {
		int i = 0;
		do {
			i++;
			if (i%5 == 0)
				System.out.println(i);
		} while(i <= 100);
	}
}