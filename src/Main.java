import java.util.Scanner;

public class Main {

	private static Scanner scan;
	private static final int INITIAL_VALUE=-99;
	private static int first=INITIAL_VALUE;
	private static int second=INITIAL_VALUE;
	private static int third=INITIAL_VALUE;	

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
		//Display the 3 biggest numbers
		if (first!=INITIAL_VALUE){
			System.out.println("Fisrt : "+first);
		}
		if (second!=INITIAL_VALUE){
			System.out.println("Second : "+second);
		}
		if (third!=INITIAL_VALUE){
			System.out.println("Third : "+third);
		}
		//System.out.println("Affichage du résultat");		
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
