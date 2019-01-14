/*
 * Simulacion de Piedra, papel y tijeras para el proyecto de Lobo
 */

import java.util.Scanner;

public class JuegoDeMano {
	public static void main(String[] args) {
		Scanner saltos = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		System.out.println("Bienvenido jugador");
		System.out.println("Presiona enter para saltarte este mensaje");
		//Salta la linea de texto
		String skip = saltos.nextLine();
		System.out.println("Las reglas son simples, debes escoger piedra, papel o tijera.");
		//Salto de linea
		String skip2 = saltos.nextLine();
		System.out.println("Piedra > tijera, tijera > papel, papel > piedra");
		//Salto de linea
		String skip3 = saltos.nextLine();
		System.out.println("Escoge alguna de las tres: ");
		System.out.print("0.- Piedra\n" + 
			                "1.- Papel\n" + 
			                "2.- Tijeras\n");
		//Lo que ingrese el usuario
		int user = s.nextInt();
		switch (user) {
			case 0:
				System.out.println("Piedra");
				break;
			case 1:
				System.out.println("Papel");
				break;
			case 2:
				System.out.println("Tijeras");
				break;
			default:
				System.out.println("Debes seleccionar alguna de las tres");
				break;	
		}
		int cpuMano = (int)(Math.random() * 3);
		switch (cpuMano) {
			case 0:
				System.out.println("Piedra");
				break;
			case 1:
				System.out.println("Papel");
				break;
			case 2:
				System.out.println("Tijeras");
				break;
			default:
				System.out.println("Error en el sistema");
				break;
		}
		if (user==0 && cpuMano==2 || user==1 && cpuMano==0 
			|| user==2 && cpuMano==1) 
			System.out.println("Ganaste!");
		 else if (cpuMano==0 && user==2 || cpuMano==1 && user==0 
			|| cpuMano==2 && user==1) {
			System.out.println("Perdiste!");
		} else {
			System.out.println("Empataron!");
		}
	}
}