/**
 *Ejercicio 6 del libro Aprende Java con Ejercicios de Lectura de Datos
*/
//This program calcultate Triangle`s area
import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		//Solution 1
		System.out.println("Gimme Triangle`s base: ");
		double base = Double.parseDouble(System.console().readLine());
		System.out.println("Gimme Triangle`s height: ");
		double height = Double.parseDouble(System.console().readLine());
		int con = 2;
		double area = (base * height)/con;
		System.out.println("Triangle`s area is: " +"\t"+ area);
		//Solution 2
		Scanner s = new Scanner(System.in);
		System.out.println("Gimme Triangle`s base: ");
		double baseT = s.nextDouble();
		System.out.println("Gimme Triangle`s height: ");
		double heightT = s.nextDouble();
		int cons = 2;
		double areaT = (baseT * heightT)/cons;
		System.out.println("Triangle`s area is: " +"\t"+ areaT);		
	}
}