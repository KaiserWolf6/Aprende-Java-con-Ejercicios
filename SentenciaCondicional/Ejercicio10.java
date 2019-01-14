/*
 *Ejercicio 10 del libro Aprende Java con Ejercicios de Sentencia condicional
 *This program can give your horoscope 
 */
import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//day
		int day;
		//Months
		System.out.println("When is your birthday: ");
		System.out.print("1.- January\n" + 
			                "2.- February\n" + 
			                "3.- March\n" +
			                "4.- April\n" +
			                "5.- May\n" +
			                "6.- June\n" +
			                "7.- July\n" +
			                "8.- August\n" +
			                "9.- September\n" +
			                "10.- October\n" +
			                "11.- November\n" +
			                "12.- December\n");
		//Input of the user
		int user = s.nextInt();
		if (user == 0 || user < 0 || user > 12) 
			System.out.println("Error!");
		switch (user) {
			case 1:
				System.out.println("Input your birthday day: ");
				day = s.nextInt();
				if (day <= 19) 
					System.out.println("You are capricorn");
				 else if (day <= 31) 
					System.out.println("You are Aquarius");
				 else 
					System.out.println("Error!");
				break;
			case 2:
				System.out.println("Input your birthday day: ");
				day = s.nextInt();
				if (day <= 18) 
					System.out.println("You are Aquarius");
				 else if (day <= 28) 
					System.out.println("You are Pisces");
				 else 
					System.out.println("Error!");
				break;
			case 3:
				System.out.println("Input your birthday day: ");
				day = s.nextInt();
				if (day <= 20) 
					System.out.println("You are Pisces");
				 else if (day <= 31) 
					System.out.println("You are Aries");
				 else 
					System.out.println("Error!");
				break;
			case 4:
				System.out.println("Input your birthday day: ");
				day = s.nextInt();
				if (day <= 19) 
					System.out.println("You are Aries");
				 else if (day <= 30) 
					System.out.println("You are Taurus");
				 else 
					System.out.println("Error!");
				break;
			case 5:
				System.out.println("Input your birthday day: ");
				day = s.nextInt();
				if (day <= 20) 
					System.out.println("You are Taurus");
				 else if (day <= 31) 
					System.out.println("You are Gemini");
				 else 
					System.out.println("Error!");
				break;
			case 6:
				System.out.println("Input your birthday day: ");
				day = s.nextInt();
				if (day <= 20) 
					System.out.println("You are Gemini");
				 else if (day <= 30) 
					System.out.println("You are Cancer");
				 else 
					System.out.println("Error!");
				break;
			case 7:
				System.out.println("Input your birthday day: ");
				day = s.nextInt();
				if (day <= 22) 
					System.out.println("You are Cancer");
				 else if (day <= 31) 
					System.out.println("You are Leo");
				 else 
					System.out.println("Error!");
				break;
			case 8:
				System.out.println("Input your birthday day: ");
				day = s.nextInt();
				if (day <= 22) 
					System.out.println("You are Leo");
				 else if (day <= 31) 
					System.out.println("You are Virgo");
				 else 
					System.out.println("Error!");
				break;
			case 9:
				System.out.println("Input your birthday day: ");
				day = s.nextInt();
				if (day <= 22) 
					System.out.println("You are Virgo");
				 else if (day <= 30) 
					System.out.println("You are Pound");
				 else 
					System.out.println("Error!");
					break;	
			case 10:
				System.out.println("Input your birthday day: ");
				day = s.nextInt();
				if (day <= 22) 
					System.out.println("You are Pound");
				 else if (day <= 31) 
					System.out.println("You are Scorpio");
				 else 
					System.out.println("Error!");
				break;
			case 11:
				System.out.println("Input your birthday day: ");
				day = s.nextInt();
				if (day <= 21) 
					System.out.println("You are Scorpio");
				 else if (day <= 30) 
					System.out.println("You are Sagittarius");
				 else 
					System.out.println("Error!");
				break;
			case 12:
				System.out.println("Input your birthday day: ");
				day = s.nextInt();
				if (day <= 21) 
					System.out.println("You are Sagittarius");
				 else if (day <= 30) 
					System.out.println("You are Capricorn");
				 else 
					System.out.println("Error!");
				break;
			default:
				System.out.println("Error");																																																																														
		}


	}
}