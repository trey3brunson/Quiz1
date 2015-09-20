package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		double touchdowns;
		double totalYards;
		double interceptions;
		double completions;
		double passesAtempted;

		

			System.out.print("Touchdowns thrown.");
			 touchdowns = userInput.nextDouble();
			System.out.print("Total Yards thrown.");
			 totalYards = userInput.nextDouble();
			System.out.print("Completions");
			 completions = userInput.nextDouble();
			System.out.print("Passes thrown");
			 passesAtempted = userInput.nextDouble();
			System.out.print("Interceptions thrown.");
			 interceptions = userInput.nextDouble();

			System.out.println((((completions/passesAtempted-.3)*5) + 
					((totalYards/passesAtempted-3)*.25) +
					((touchdowns/ passesAtempted)*20) +
					(2.375-(interceptions /passesAtempted*25)
							))/6);
		}
}
