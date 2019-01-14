/*
 *Ejercicio 11 del libro Aprende Java con Ejercicios de Sentencia condicional
 *This program can say if a number is pair and it can divided in five  
 */
import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Input one number: ");
		//number inputted by user
		int user = s.nextInt();
		System.out.println("Now, I am gonna check if it is pair: ");
		if ((user % 2) == 0) 
			System.out.println("It is pair:" + "\t" + user);
		else
			System.out.println("It is noun:" + "\t" + user);
		System.out.println("Now, I am gonna check if it can divided by 5");
		if ((user % 5) == 0) 
			System.out.println("Yes, it can: " + "\t" + user);
		else
			System.out.println("No, it can`t: " + "\t" + user);
	}
}
