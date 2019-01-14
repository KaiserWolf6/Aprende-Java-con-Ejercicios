/*
 *Ejercicio 4 del libro Aprende Java con Ejercicios de Sentencia condicional
*/
/*
 *This program calculate the weekly salary from a worker
*/
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Input the hours that you work: ");
		int work_hours = s.nextInt();
		int total_hours;
		int weekly_salary;
		if (work_hours <= 40) {
			total_hours = work_hours * 12;
			weekly_salary = total_hours * 7;
			System.out.println("Your weekly salary is: " +"\t"+ weekly_salary);
		} else if (work_hours >= 41) {
			total_hours = work_hours * 16;
			weekly_salary = total_hours * 7;
			System.out.println("Your weekly salary is: " +"\t"+ weekly_salary);
		} else {
			System.out.println("Error!");
		}
	}
}