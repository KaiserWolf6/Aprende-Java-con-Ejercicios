/*
 *Ejercicio 16 del libro Aprende Java con Ejercicios de Sentencia condicional
 *This program receive a text to make a test about if our boyfriend or girlfriend
 *is cheat you 
 */
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio16 {
	
	public static void muestraContenido(String test) throws FileNotFoundException, IOException {
		String cadena;
		FileReader f = new FileReader(test);
		BufferedReader b = new BufferedReader(f);
		while ((cadena = b.readLine()) != null) {
			System.out.println(cadena);
		}
		b.close();
	}

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		String r, r2, r3, r4;
		int conteo = 3;
		int resul;
		System.out.println("Responde a las siguientes preguntas con si o no");
		System.out.println("Su pareja ya no pasa mucho tiempo con usted?");
		r = s.next();
		if (r.equals("si")) 
			conteo = 3;
		else
			conteo = 0;
		System.out.println("Le presta atencion cuando habla con usted?");
		r2 = s.next();
		if (r2.equals("si")) 
			conteo += 3;
		else
			conteo= 0;
		System.out.println("Su pareja tiene siempre un apetito sexual muy bajo con usted?");
		r3 = s.next();
		if (r3.equals("si")) 
			conteo += 3;
		
		System.out.println("No la suele ver mucho en casa o suele cancelar sus citas con usted?");
		r4 = s.next();
	}
}
