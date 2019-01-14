/*
 *Ejercicio 1=2 del libro Aprende Java con Ejercicios de Sentencia condicional
*/
/*
 *This program asks by type a hour to return a greeting
*/
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//Hour
		System.out.println("Input a hour: ");
		int hour = s.nextInt();
		if (hour >= 6 && hour <= 12) {
			System.out.println("Good morning!");
		} else if (hour >= 13 && hour <= 20) {
			System.out.println("Good Afternoon!");
		} else if (hour >= 21 && hour <= 24 || hour < 6) {
			System.out.println("Good night!");
		} else {
			System.out.println("Input an Integer! Try again!");
		}
	}
}