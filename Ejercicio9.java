/*
 *Ejercicio 9 del libro Aprende Java con Ejercicios de Lectura de Datos
*/
//This program calcultes Cone`s volumen
import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		//Solution 1
		//Numerator
		int num = 1;
		//Doomering
		int dom = 3;
		//Pi`s value
		double pi = 3.1416;
		//Radio
		System.out.println("Gimme Cone`s radio: ");
		double radio = Double.parseDouble(System.console().readLine());
		//Potency of radio
		double potency = radio * radio;
		//Cone`s height
		System.out.println("Gimme Cone`s height: ");
		double height = Double.parseDouble(System.console().readLine());
		//Cone`s volume
		double volume = (num * pi * potency * height)/dom;
		//Result
		System.out.println("Cone`s volume is: " +"\t"+ volume);
		//Solution 2
		Scanner s = new Scanner(System.in);
		//Numerator
		int numC = 1;
		//Doomering
		int domC = 3;
		//Pi`s value
		double piC = 3.1416;
		//Radio
		System.out.println("Gimme Cone`s radio: ");		
		double radioC = s.nextDouble();
		//Potency of radio
		double potencyC = radioC * radioC;
		//Cone`s height
		System.out.println("Gimme Cone`s height: ");		
		double heightC = s.nextDouble();
		//Cone`s volume
		double volumeC = (numC * piC * potencyC * heightC)/domC;
		//Result
		System.out.println("Cone`s volume is: " +"\t"+ volumeC);		
		//Alternative solution
		//Numerator
		int n = 1;
		//Doomering
		int d = 3;
		//Pi`s value
		double p = 3.1416;
		//Radio
		System.out.println("Gimme Cone`s radio: ");		
		double r = s.nextDouble();
		r *= r;
		//Cone`s height
		System.out.println("Gimme Cone`s height: ");		
		double h = s.nextDouble();
		//Cone`s volume
		double v = (n * p * r * h)/d;
		//Result
		System.out.println("Cone`s volume is: " +"\t"+ v);		
	}
}