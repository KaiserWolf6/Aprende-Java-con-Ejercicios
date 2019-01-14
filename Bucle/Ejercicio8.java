import java.util.Scanner;
/*
 * Muestra la tabla de multiplicar de un numero introducido por teclado
*/
public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese el numero que desee ver su tabla de multiplicar");
		//Input user
		int input = s.nextInt();
		System.out.println("El numero que ingreso fue: " +input);
		System.out.println("Esta es su tabla de multiplicacion: ");
		if (input == 0)
			System.out.println(input);
		for (int i = 0; i <= 100; i++) {
			int result = input * i;
			System.out.println(result);
			System.out.println(input + "x" + i + "=" + (input * i));
		}
	}
}