/**
 *Ejercicio 1 de Lectura de datos de Aprende Java con Ejercicios
*/
//This program ask 2 numbers to user then they are multiply for themselves
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		/**String nombre;
		System.out.print("Por favor, dime cómo te llamas: ");
		nombre = System.console().readLine();
		System.out.println("Hola " + nombre + ", ¡encantado de conocerte!");*/
		//Solution 1
		System.out.println("Gimme one number: ");
		int uno = Integer.parseInt(System.console().readLine());
		System.out.println("Gimme another number: ");
		int dos = Integer.parseInt(System.console().readLine());
		int total = uno * dos;
		System.out.println("Result: " + total);
		//Solution 2
		Scanner s = new Scanner(System.in);
		System.out.println("Gimme one number: ");
		int one = s.nextInt();
		System.out.println("Gimme another number: ");
		int two = s.nextInt();
		int result = one * two;
		System.out.println("Result: " + result);
	}
}