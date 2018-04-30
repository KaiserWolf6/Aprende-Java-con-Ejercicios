/*
 *Ejercicio 12 del libro Aprende Java con Ejercicios de Lectura de Datos
*/
/*
 *This program calculates the final cost of a product, in fact original price
 *IVA Type and promotional code
*/
import java.util.Scanner;
public class Ejercicio12 {
	public static void main(String[] args) {
		//Solution 1
		String general = "general";
		String reduce = "reduce";
		String superReduce = "super-reduce";
		String nopro = "nopro";
		String mitad = "mitad";
		String meno5 = "meno5";
		String porc = "5porc";
		//Original price
		System.out.println("Input the original price of the product: ");
		double originalPrice = Double.parseDouble(System.console().readLine());
		System.out.println("Base imponible: " +"\t"+ originalPrice);
		//IVA
		System.out.println("Input what kind of IVA you want (general, reduce o super-reduce): ");
		String input = System.console().readLine();
		//IVA general
		double gen = (originalPrice * 21)/100;
		//IVA reduce
		double red = (originalPrice * 10)/100;
		//IVA super reduce
		double supe = (originalPrice * 4)/100;
		//Casos
		if (input.equals(general)) {
			System.out.println("IVA (21%): " +"\t"+ gen);
			double priceG = gen + originalPrice;
			System.out.println("Price with IVA: " +"\t"+ priceG);
			//Promotional codes
			System.out.println("Input the promotional code (nopro, mitad, meno5 o 5porc): ");
			String inpu = System.console().readLine();
			//nopro
			double no =  priceG - 0;
			//mitad
			double m = priceG/2;
			//meno5
			double me = priceG - 5;
			//5porc
			double p = (priceG * 5)/100;
			double totalG = priceG - p;			
			//Casos
			if (inpu.equals(nopro)) {
				System.out.println("Promo. Code. (No promo): " +"\t-"+ no);
				System.out.println("TOTAL: " +"\t"+ no);
			} else if (inpu.equals(mitad)) {
				System.out.println("Promo. Code. (half): " +"\t-"+ m);
				System.out.println("TOTAL: " +"\t"+ m);				
			} else if (inpu.equals(meno5)) {
				System.out.println("Promo. Code. (meno5): " +"\t-"+ me);
				System.out.println("TOTAL: " +"\t"+ me);				
			} else if (inpu.equals(porc)) {
				System.out.println("Promo. Code. (5porc): " +"\t-"+ p);
				System.out.println("TOTAL: " +"\t"+ totalG);				
			} else {
				System.out.println("Promotional Code invalid. Try again.");
			}
		} else if (input.equals(reduce)) {
			System.out.println("IVA (10%): " +"\t"+ red);
			double priceR = red + originalPrice;
			System.out.println("Price with IVA: " +"\t"+ priceR);
			//Promotional codes
			System.out.println("Input the promotional code (nopro, mitad, meno5 o 5porc): ");
			String inp = System.console().readLine();
			//nopro
			double noR =  priceR - 0;
			//mitad
			double mR = priceR/2;
			//meno5
			double meR = priceR - 5;
			//5porc
			double pR = (priceR * 5)/100;
			double totalR = priceR - pR;			
			//Casos
			if (inp.equals(nopro)) {
				System.out.println("Promo. Code. (No promo): " +"\t-"+  noR);
				System.out.println("TOTAL: " +"\t"+ noR);
			} else if (inp.equals(mitad)) {
				System.out.println("Promo. Code. (half): " +"\t-"+ mR);
				System.out.println("TOTAL: " +"\t"+ mR);				
			} else if (inp.equals(meno5)) {
				System.out.println("Promo. Code. (meno5): " +"\t-"+ meR);
				System.out.println("TOTAL: " +"\t"+ meR);				
			} else if (inp.equals(porc)) {
				System.out.println("Promo. Code. (5porc): " +"\t-"+ pR);
				System.out.println("TOTAL: " +"\t"+ totalR);				
			} else {
				System.out.println("Promotional Code invalid. Try again.");
			}			
		} else if (input.equals(superReduce)){
			System.out.println("IVA (4%): "  +"\t"+ supe);
			double priceS = supe + originalPrice;
			System.out.println("Price with IVA: " +"\t"+ priceS);
			//Promotional codes
			System.out.println("Input the promotional code (nopro, mitad, meno5 o 5porc): ");
			String inpuS = System.console().readLine();
			//nopro
			double noS =  priceS - 0;
			//mitad
			double mS = priceS/2;
			//meno5
			double meS = priceS - 5;
			//5porc
			double pS = (priceS * 5)/100;
			double totalS = priceS - pS;
			//Casos
			if (inpuS.equals(nopro)) {
				System.out.println("Promo. Code. (No promo): " +"\t-"+ noS);
				System.out.println("TOTAL: " +"\t"+ noS);
			} else if (inpuS.equals(mitad)) {
				System.out.println("Promo. Code. (half): " +"\t-"+ mS);
				System.out.println("TOTAL: " +"\t"+ mS);				
			} else if (inpuS.equals(meno5)) {
				System.out.println("Promo. Code. (meno5): " +"\t-"+ meS);
				System.out.println("TOTAL: " +"\t"+ meS);				
			} else if (inpuS.equals(porc)) {
				System.out.println("Promo. Code. (5porc): " +"\t-"+ pS);
				System.out.println("TOTAL: " +"\t"+ totalS);				
			} else {
				System.out.println("Promotional Code invalid. Try again.");
			}			
		} else {
			System.out.println("IVA no recognized. Please try again.");
		}
		/*
		//Solution 2
		String iva;
		String promoCode;
		double ivaOperation;
		double ivaTotal;
		double promoOperation;
		System.out.println("Ingresa el precio original: ");
		double originalPrice = Double.parseDouble(System.console().readLine());
		System.out.println("Base imponible: " +"\t"+ originalPrice);
		//IVA
		System.out.println("Ingrese el tipo de IVA (1.- general, 2.- reduce o 3.- super-reduce): ");
		int input = Integer.parseInt(System.console().readLine());
		switch (input) {
			case 1: 
				iva = "general";
				ivaOperation = (originalPrice * 21)/100;
				ivaTotal = originalPrice + ivaOperation;
				break;	
			case 2:
				iva = "reduce";
				ivaOperation = (originalPrice * 10)/100;
				ivaTotal = originalPrice + ivaOperation;
				break;
			case 3:
				iva = "super-reduce";
				ivaOperation = (originalPrice * 4)/100;
				ivaTotal = originalPrice + ivaOperation;
				break;
			default:
				System.out.println("IVA no reconocido. Por favor, intente de nuevo");						
						}
		System.out.println("IVA: "  +input+ ": " +"\t"+ iva);
		System.out.println("Precio con IVA: " +input +"\t"+ ivaTotal);		
		//Promotional Code
		System.out.println("Ingrese el codigo promocional (nopro, mitad, meno5 o porc5): ");
		int inpu = Integer.parseInt(System.console().readLine());
		switch (inpu) {
			case 1:
				promoCode = "nopro";
				promoOperation = ivaTotal + 0;
				break;
			case 2:
				promoCode = "mitad";
				promoOperation = ivaTotal/2;
				break;
			case 3:
				promoCode = "meno5";
				promoOperation = ivaTotal - 5;
				break;
			case 4:
				promoCode = "porc5";
				double especial = (ivaTotal * 5)/100;
				promoOperation = ivaTotal - especial;
				break;	
			default:
				System.out.println("No existe ese codigo de promocion. Intente de nuevo");						
						}*/
		//System.out.println("Codigo de promocion: " +inpu +"\t-"+ promoOperation);
		//System.out.println("TOTAL: " +inpu +"\t"+ promoOperation);							
	}
}