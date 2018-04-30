/*
 *Ejercicio 8 del libro Aprendiendo Java con Ejercicios de Lectura de Datos
*/
//This program calculates Employee`s week salary in base how many hours he works.
import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		//Solution 1
		//Earning for hour to workers
		int perHour = 12;
		//Journey from worker in one day
		System.out.println("Input how many hours you work at day: ");
		int dayHours = Integer.parseInt(System.console().readLine());
		//How many days he works at weekend
		System.out.println("Input how many days you work at weekend: ");
		int daysJourney = Integer.parseInt(System.console().readLine());
		//Worker`s salary at weekend
		int salary = (perHour * dayHours) * daysJourney; 
		System.out.println("Your salary is: " +"\t"+ salary);
		//Solution 2
		Scanner s = new Scanner(System.in);
		//Earning for hour to workers
		int perHourW = 12;
		//Journey from worker in one day
		System.out.println("Input how many hours you work at day: ");
		int dayHoursW = s.nextInt();
		//How many days he works at weekend
		System.out.println("Input how many days you work at weekend: ");
		int daysJourneyW = s.nextInt();
		//Worker`s salary at weekend
		int salaryW = (perHourW * dayHoursW) * daysJourneyW; 
		System.out.println("Your salary is: " +"\t"+ salaryW);		

	}
}