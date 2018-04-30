/**
 *Ejercicio 3 del libro Aprende Java con Ejercicios
*/
import java.util.Scanner;
//This program convert dollars to pesos
public class Ejercicio3 {
	public static void main(String[] args) {
		//Solution 1
		Scanner s = new Scanner(System.in);
		System.out.println("Amount of dollars you want to convert in pesos: ");
		double dollars = s.nextDouble();
		double pesos = 0.052;
		double convert = pesos * dollars;
		System.out.println("This is the amount of dollars to pesos: " + convert);
		//Solution 2
		System.out.println("Amount of dollars you want to convert in pesos: ");
		double dollar = Double.parseDouble( System.console().readLine() );
		double peso = 0.052;
		double converter = peso * dollar;
		System.out.println("This is the amount of dollars to pesos: " + converter);
		
	}
}
	

