/*
 *Ejercicio 3 del libro Aprende Java con Ejercicios de Sentencia condicional
*/
/*
 *This program asks by type the number of the day of the week
*/
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//Hour
		System.out.println("Input a number 1 to 7: ");
		int day = s.nextInt();
		switch (day) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;						
			case 5:
				System.out.println("Friday");
				break;					
			case 6:
				System.out.println("Saturday");
				break;						
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("It just exist seven days! No more! Try again!");																						
		}
	}
}