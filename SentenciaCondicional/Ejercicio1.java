/*
 *Ejercicio 1 del libro Aprende Java con Ejercicios de Sentencia condicional
*/
/*
 *This program asks by type a day of the week & return school's schedule
 * for the first hour 
*/
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Choose a day to check your subject that you have at first hour");
		//Day of the week
		int num_OfTheDay = s.nextInt();
		switch (num_OfTheDay) {
			case 1:
				System.out.println("Monday" +"\t"+ "History at 7:00 o'clock");
				break;
			case 2:
				System.out.println("Tuesday" +"\t"+ "Mathematics at 7:00 o'clock");
				break;
			case 3:
				System.out.println("Wednesday" +"\t"+ "French at 8:40 o'clock");
				break;
			case 4:
				System.out.println("Thursday" +"\t"+ "Philosophy at 7:00 o'clock");
				break;
			case 5:
				System.out.println("Friday" +"\t"+ "Physical at 9:30 o'clock");
				break;
			default:
				if (num_OfTheDay > 5) {
					System.out.println("That's impossible! You do not have activities on weekend or it not exists more of 9 days");
				} else {
					System.out.println("Input Integer! Try again!");
				}
		}
	}
}