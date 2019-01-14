/*
 *Ejercicio 7 del libro Aprende Java con Ejercicios de Sentencia condicional
 *This program can calculate the average of three notes 
 */
import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//First score
		System.out.println("Input your three scores of your exemans: ");
		double first_score = s.nextDouble();
		//Second score
		double second_score = s.nextDouble();
		//Third score
		double third_score = s.nextDouble();
		System.out.println("Calculating your average...");
		//The sum
		double first_step = first_score + second_score + third_score;
		//It is divided for the amount of numbers
		double final_step = first_step / 3;
		if (final_step > 5) 
			System.out.println("Congratulations! You pass to the next year: " +"\t"+ final_step);
		else
			System.out.println("Sorry! You need to repeat the year: " +"\t"+ final_step);

	}
}