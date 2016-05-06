import java.util.Scanner;

public class Main {
	
	private static Scanner scan;
	//The fist 3 numbers have the INITIAL_VALUE=-99
	private static final int INITIAL_VALUE=-99;
	private static int first=INITIAL_VALUE;
	private static int second=INITIAL_VALUE;
	private static int third=INITIAL_VALUE;	

	public static void main(String[] args) {
		// Create keyboard scanner
		scan = new Scanner(System.in);
		
		int number = 0;
		while (number != -1) { //-1 is the value to exit
			// New input
			System.out.println("Entrez une nouvelle valeur :");
			number = getInputNumber();
			
			if (number == -2) {//-2 is the state value for invalid input
				System.out.println("Valeur invalide");
			}
			else if (number == -1) { //Finish
				displayEnd();
			}
			else { //Sort and display the "podium"
				sortBiggestNumbers(number);
				displayBiggestNumbers();
			}
		}		
	}
	
	private static void sortBiggestNumbers(int number) {
		//Set the 3 first positions
		if (number > first) {
			third = second;
			second = first;
			first = number;
		}
		else if (number > second) {
			third = second;
			second = number;
		}
		else if (number > third) {
			third = number;
		}
	}

	private static void displayEnd() {
		System.out.println("Fin du jeu");		
	}

	private static void displayBiggestNumbers() {
		//Display the 3 biggest numbers, no display if INITIAL_VALUE
		if (first!=INITIAL_VALUE){
			System.out.println("Fisrt : "+first);
		}
		if (second!=INITIAL_VALUE){
			System.out.println("Second : "+second);
		}
		if (third!=INITIAL_VALUE){
			System.out.println("Third : "+third);
		}		
	}

	public static int getInputNumber() {
		//The value of input scanner or a state exception value (-1 or -2)
		int in = -2;
		// Convert the keyboard input to int
		try {
			in = Integer.valueOf(scan.nextLine());
		}
		catch (Exception e) {
			in = -2;
		}
		
		if (in < -2) {
			in = -2;
		}
		
		return in;
	}

}
