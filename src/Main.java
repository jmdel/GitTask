import java.util.Scanner;

public class Main {

	private static Scanner scan;
	
	private static int firt;
	private static int second;
	private static int third;	

	public static void main(String[] args) {
		// Create keyboard scanner
		scan = new Scanner(System.in);
		
		int number = 0;
		while (number != -1) {
			// New input
			System.out.println("Entrez une nouvelle valeur :");
			number = getInputNumber();
			
			if (number == -2) {
				System.out.println("Valeur invalide");
			}
			else if (number == -1) {
				displayEnd();
			}
			else {
				displayBiggestNumbers();
			}
		}		
	}

	private static void displayEnd() {
		System.out.println("Fin du jeu");		
	}

	private static void displayBiggestNumbers() {
		System.out.println("Affichage du résultat");		
	}

	public static int getInputNumber() {
		int in = -1;
		// Convert the keyboard input to int
		try {
			in = Integer.valueOf(scan.nextLine());
		}
		catch (Exception e) {
			in = -2;
		}
		
		return in;
	}

}
