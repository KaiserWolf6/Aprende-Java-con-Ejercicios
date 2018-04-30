/**
 *Ejercicio 2 del libro Aprende Java con Ejercicios
*/
import java.util.Scanner;
//This program convert pesos to dollars, recibing an entry from the user
public class Ejercicio2 {
	public static void main(String[] args) {
		//Solution 1
		Scanner s = new Scanner(System.in);
		System.out.println("Amount of pesos you want to convert in dollars: ");
		double pesos = s.nextDouble();
		double dollars = 20.80;
		double convert = pesos * dollars;
		System.out.println("This is the amount of pesos to dollars: " + convert);
		//Solution 2
		System.out.println("Amount of pesos you want to convert in dollars: ");
		double peso = Double.parseDouble( System.console().readLine() );
		double dollar = 20.80;
		double converter = peso * dollar;
		System.out.println("This is the amount of pesos to dollars: " + converter);

	}
}