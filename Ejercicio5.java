/*
 * Ejercicio 5 del libro Aprende Java con Ejercicios de Lectura de Datos
**/
//This program calculate rectangle`s area
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		//Solution 1
		System.out.println("Gimme rectangle`s base: ");
		double base = Double.parseDouble(System.console().readLine());
		System.out.println("Gimme rectangle`s height: ");
		double height = Double.parseDouble(System.console().readLine());
		double area = base * height;
		System.out.println("Rectangle`s area is: " + "\t" + area);
		//Solution 2
		Scanner s = new Scanner(System.in);
		System.out.println("Gimme rectangle`s base: ");
		double baseR = s.nextDouble();
		System.out.println("Gimme rectangle`s height: ");
		double heightR = s.nextDouble();
		double areaR = baseR * heightR;
		System.out.println("Rectangle`s area is: " + "\t" + areaR);		
	}
}

