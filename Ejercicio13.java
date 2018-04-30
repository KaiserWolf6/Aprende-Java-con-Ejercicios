/*
 *Ejercicio 13 del libro Aprende Java con Ejercicios de Lectura de Datos
*/
/*
 *This program calculates the final cost of a product, in fact original price
 *IVA Type and promotional code
*/
import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Input your average of your first exam: ");
		double first_exam = s.nextDouble();
		System.out.println("Which do you want to get final average?");
		double wish_average = s.nextDouble();
		double second_exam = (wish_average * 2) - first_exam;
		System.out.println("If you want that final average, you must get" +"\t" + second_exam + "\t" +  "in your second exam");  
	}
}