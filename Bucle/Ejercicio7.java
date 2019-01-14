import java.util.Scanner;
/*
 * Realiza el control de acceso a una caja fuerte. La combinacion sera
 * un numero de cuatro cifras. El programa nos pedira la combinacion para
 * abrirla. Si no acertamos, se nos mostrara el mensaje "Lo siento, esa
 * no es la combinacion" y si acertaos se dira "La caja fuerte se ha
 * abierto satisfactoriamente". Tendremos cuatro oportunidades para
 * para abrir la caja fuerte.
*/
public class Ejercicio7 {
	public static void main(String[] args) {
		//Key box
		int key = 7423;
		Scanner s = new Scanner(System.in);
		System.out.println("Ingresa la clave para abrir la caja fuerte: ");
		//Input user
		//User Opportunities
		int chance = 1;
		int max = 4;
		while (chance < max) {
			int input = s.nextInt();
			//Verify if the input is equals to key
			if (input == key) {
				System.out.println("Box opened");
				break;
			}
			else {
				System.out.println("Try again");		 
			}
			chance ++;
			if (chance == max) {
				System.out.println("Box will not opened!");
			}
		}
		

	}
}