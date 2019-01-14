/*
 *Ejercicio 11 del libro Aprende Java con Ejercicios de Sentencia condicional
 *This program can let you choose the position of a pyramid 
 */
import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Select the position of the pyramid: ");
		System.out.print("1.- Left\n" + 
			                "2.- Right\n" + 
			                "3.- Up\n" +
			                "4.- Down\n");
		//Input
		int select = s.nextInt();
		String up = ("*");
		String middle1 = "**";
		String middle2 = "***";
		String below1 = "**";
		String below2 = "*";
		String pyramid = up + "\n" + middle1 + "\n" + middle2 + "\n" + below1 + "\n" + below2;
		StringBuilder newPyramid = new StringBuilder();
		newPyramid.append(pyramid);
		newPyramid = newPyramid.reverse();
		switch (select) {
		 	case 1:
		 		System.out.println(newPyramid);	 				 		
  				break;			 	
		 	case 2:
		 		System.out.println("\t*");
		 		System.out.println("\t**");
		 		System.out.println("\t***");
		 		System.out.println("\t**");
		 		System.out.println("\t*");		 				 		
  				break;			 		
		 	case 3:
		 		System.out.println("" + "\t*");
		 		System.out.println("\t***");
		 		System.out.println("\t*****");
  				break;		 	
		 	case 4:
		 		System.out.println("\t*****");
		 		System.out.println("\t***\t");
		 		System.out.println("\t*");
  				break;
  			default:
  				System.out.println("Error!");
  				break;			
		} 		
	}
}
