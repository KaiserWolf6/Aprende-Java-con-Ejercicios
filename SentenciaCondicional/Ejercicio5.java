/*
 *Ejercicio 4 del libro Aprende Java con Ejercicios de Sentencia condicional
*/
/*
 *This program solve problems of equations of first grade type ax + b = c
*/
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//Cons a
		System.out.println("Input the value of cons a: ");
		int a = s.nextInt();
		//Cons b
		System.out.println("Input the value of cons b: ");
		int b = s.nextInt();
		//Cons c
		System.out.println("Input the value of cons c: ");
		int c = s.nextInt();
		//Incognita
		int x;
		//If all the cons are 0, the result is 0
		//First, it is reduced ax = c - b
		int operation = c - b;
		
		if (a == 0 && b == 0 && c == 0) {
			x = 0;
			System.out.println("The value of x is: " +x);
		}
		else if (operation == 0) {
			x = 0;
		 	System.out.println("The value of x is: " +x);
		 } else {
			//Second, it is divides x = c-b/a
			int operation2 = operation/a;
			//Value of x
			x = operation2;
			System.out.println("The value of x is: " +"\t"+ x); 	
		 }
	}
}