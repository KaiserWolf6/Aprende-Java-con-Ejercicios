/*
 *Ejercicio 7 del libro Aprende Java con Ejercicios de Sentencia condicional
 *This program can solve equations of second grade (type ax**2+bx+c = 0) 
 */
import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//El resultado de x1 & x2
		double x1;
		double x2;
		//First cons a
		System.out.println("Input a value to the cons a: ");
		double a = s.nextInt();
		System.out.println("Input a value to the cons b: ");
		//Cons b
		double b = s.nextInt();
		System.out.println("Input a value to the cons c: ");
		//Cons c
		int c = s.nextInt();
		//Nos dice si la ecuacion es completa o incompleta
		if ((a > 0 || a < 0) && (b > 0 || b < 0) && (c > 0 || c < 0)) {
			x1 = ((- b) + (Math.sqrt((b * b) - (4 * a *c))))/2*a;
			x2 = ((- b) - (Math.sqrt((b * b) - (4 * a *c))))/2*a;
			System.out.println("Value of x1: " + "\t" + x1);
			System.out.println("Value of x2: " + "\t" + x2);
		} else if (b == 0) {
			x1 = Math.sqrt((-1) * (c/a));
			x2 = (-1) * Math.sqrt((-1) * (c/a));
			System.out.println("Value of x1: " + "\t" + x1);
			System.out.println("Value of x2: " + "\t" + x2);			  
		} else if (c == 0) {
			x1 = 0;
			x2 = (-1) * (-b/a);
			System.out.println("Value of x1: " + "\t" + x1);
			System.out.println("Value of x2: " + "\t" + x2);
		} else if (a == 0) {
			// bx + c = 0
			double x = (-c/b);
			System.out.println("Value of x: " + "\t" + x);
		} else {
			System.out.println("Error!");
		}
	}
}