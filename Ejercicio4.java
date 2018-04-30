/**
 *Ejercicio 4 del libro Aprende Java con Ejercicios en Lectura de Datos
*/

import java.util.Scanner;
//This program can plus, less, multiply and divide
public class Ejercicio4 {
	public static void main(String[] args) {
		//Solution 1
		System.out.println("Gimme a number: ");
		int num = Integer.parseInt(System.console().readLine());
		System.out.println("Gimme another number: ");
		int num2 = Integer.parseInt(System.console().readLine());
		int suma = num + num2;
		int resta = num2 - num;
		int multi = num * num2;
		double div = (double)num / (double)num2;
		System.out.println("La suma es: " +"\t"+ suma + "la resta es: " +"\t"+ resta +  
			               "La multiplicacion es: " +"\t"+ multi + "La division es: " +"\t"+ div);
		//Solution 2
		Scanner s = new Scanner(System.in);
		System.out.println("Gimme a number: ");
		int n = s.nextInt();
		System.out.println("Gimme another number: ");
		int k = s.nextInt();
		int sum = n + k;
		int rest = k - n;
		int mult = n * k;
		double divi = (double)n / (double)k;
		System.out.println("La suma es: " +"\t"+ sum + "la resta es: " +"\t"+ rest +  
			               "La multiplicacion es: " +"\t"+ mult + "La division es: " +"\t"+ divi);		
	}
}