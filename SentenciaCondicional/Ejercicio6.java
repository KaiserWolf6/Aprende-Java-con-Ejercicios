/*
 *Ejercicio 6 del libro Aprende Java con Ejercicios de Sentencia condicional
 *This program can calculate the time it takes to fall an object from a height h 
 */
import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//cons gravity
		double gravity = 9.81;
		System.out.println("Input the height: ");
		//The height of the fall
		double height = s.nextDouble();
		//Time of the fall from the object
		double time = Math.sqrt((2 * height)/gravity);
		System.out.println("The time of the fall from the object is: " +"\t"+ time);
	}
}