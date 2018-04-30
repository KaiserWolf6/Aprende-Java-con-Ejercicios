/*
 *Ejercicio 10 del libro Aprende Java con Ejercicios de Lectura de Datos
*/
//This program converts MegaBytes to Kbytes 
import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		//Solution 1
		//Constant value of kbytes 
		double kbytes = 1024;
		//Input user wants to convert
		System.out.println("Input the megabytes you want to convert: ");
		double megabytes = Double.parseDouble(System.console().readLine());
		double converter = kbytes * megabytes;
		System.out.println("In kbytes are: " +"\t"+ converter);
		//Solution 2
		Scanner s = new Scanner(System.in);
		//Constant value of kbytes 
		double kbyte = 1024;
		//Input user wants to convert
		System.out.println("Input the megabytes you want to convert: ");
		double megabyte = s.nextDouble();
		double convert = kbyte * megabyte;
		System.out.println("In kbytes are: " +"\t"+ convert);		

	}
}