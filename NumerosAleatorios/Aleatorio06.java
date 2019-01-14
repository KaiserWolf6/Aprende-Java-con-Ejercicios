public class Aleatorio06 {
	public static void main(String[] args) {
		System.out.println("Genera al azar piedra, papel o tijera");
		int mano = (int)(Math.random()*3); //Genera un numero al azar
		switch (mano) {
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
				System.out.println("Error en el sistema!");
				break;
		}
	}
}