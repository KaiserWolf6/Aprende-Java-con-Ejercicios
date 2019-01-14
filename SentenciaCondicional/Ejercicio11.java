/*
 *Ejercicio 11 del libro Aprende Java con Ejercicios de Sentencia condicional
 *This program can calculate how much time is missing to the midnight 
 */
import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Input the hour and minutes: ");
		//hour
		int hour = s.nextInt();
		//minutes
		int minutes = s.nextInt();
		System.out.println(hour + ":0" + minutes);
		//convertion of minutes to seconds
		int minutes_to_seconds = minutes * 60;
		//Convertion of hours to seconds
		int hours_to_seconds = hour * 3600;
		//24 hours in seconds
		int twentyFour_hours = 86400;
		if (hour == 23 && minutes == 59) {
			System.out.println("It`s missing 60 seconds");
		} else if (hour > 24 && minutes > 60) {
			System.out.println("There is an error!");
		} else if (hour == 24 && minutes > 0) {
			System.out.println("It`s already midnight");
		}
		  else {
			//The sum of minutes and hours
			int sum = minutes_to_seconds + hours_to_seconds;
			int missing_to_midnight = twentyFour_hours - sum;
			System.out.println("It`s missing: " + "\t" + missing_to_midnight);
		}
	}
}