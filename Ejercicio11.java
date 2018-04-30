/*
 *Ejercicio 11 del libro Aprendiendo Java con Ejercicios d Lectura de Datos
*/
//This program converts kbytes in megabytes
import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		//Constant value of kbytes 
		double megabytes = 0.00098;
		//Input user wants to convert
		System.out.println("Input the kbytes you want to convert: ");
		double kbytes = Double.parseDouble(System.console().readLine());
		double converter = kbytes * megabytes;
		System.out.println("In megabytes are: " +"\t"+ converter);
		//Solution 2
		Scanner s = new Scanner(System.in);
		//Constant value of kbytes 
		double megabyte = 0.00098;
		//Input user wants to convert
		System.out.println("Input the kbytes you want to convert: ");
		double kbyte = s.nextDouble();
		double convert = kbyte * megabyte;
		System.out.println("In megabytes are: " +"\t"+ convert);		
	}
}