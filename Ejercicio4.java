/**
 *Ejercicio 4 del libro Aprende con Java.
 *El ejercicio consiste en hacer un horario de clases
*/
public class Ejercicio4 {
	public static void main(String[] args) {
		//First columns from my schedule
		String col1 = "Subject";
		String col2 = "Days";
		String col3 = "Hours";
		//Subjects
		String s1 = "Mathematics";
		String s2 = "Logic programming";
		String s3 = "English V";
		String s4 = "German";
		String s5 = "Formal Languages and Automatas";
		String s6 = "Computer Arquitecture";
		String s7 = "Lineal Algebra";
		//Days
		String d1 = "Monday";
		String d2 = "Tuesday";
		String d3 = "Wednesday";
		String d4 = "Thursday";
		String d5 = "Friday";
		//Hours
		String h1 = "8:00 - 10:00";
		String h2 = "10:00 - 11:00";
		String h3 = "11:00 - 12:00";
		String h4 = "12:00 - 13:00";
		String h5 = "13:00 - 15:00";
		String h6 = "15:00 - 16:00";
		String h7 = "16:00 - 18:00";
		System.out.println(col1 + "\t" + "\t" + "\t" + col2 + "\t" + "\t" + "\t" + col3);
		System.out.println(s1 + "\t" + "\t" + d1 + "," + d3 + "," + d5 + "\t" + h1);
		System.out.println(s5 + "\t" + "\t" + "\t" + d1 + "," + d2 + "," + d3 + "," + d4 + "," + d5 + "\t" + h2);
		System.out.println(s2 + "\t" + "\t" + "\t" + d1 + "," + d2 + "," + d3 + "," + d4 + "," + d5 + "\t" + h3);
		System.out.println(s6 + "\t" + "\t" + "\t" + d1 + "," + d2 + "," + d3 + "," + d4 + "," + d5 + "\t" + h4);
		System.out.println(s4 + "\t" + "\t" + "\t" + d1 + "," + d2 + "," + d3 + "," + d4 + "," + d5 + "\t" + h5);
		System.out.println(s7 + "\t" + "\t" + "\t" + d1 + "," + d2 + "," + d3 + "," + d4 + "," + d5 + "\t" + h6);
		System.out.println(s3 + "\t" + "\t" + "\t" + d1 + "\t" + h7);
	}
}