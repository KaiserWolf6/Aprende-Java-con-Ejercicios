/*
 *Ejercicio 11 del libro Aprende Java con Ejercicios de Sentencia condicional
 *This program can sort three integers numbers that they were inputted by the user 
 */
import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Input three numbers: ");
		//Random numbers inputted by user
		int numberOne = s.nextInt();
		int numberTwo = s.nextInt();
		int numberThree = s.nextInt();
		System.out.println("Now, I am gonna sort this numbers");
		if (numberOne == numberTwo && numberOne == numberThree) {
			System.out.println("They are the same numbers");
			System.out.println(numberOne + "\n" + numberTwo + "\n" + numberThree);
		} else if (numberOne > numberTwo && numberOne > numberThree) {
			System.out.println(numberOne);
			System.out.println(numberTwo);
			System.out.println(numberThree);
		}
	}
}