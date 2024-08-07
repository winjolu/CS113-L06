package edu.miracosta.cs113.change;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueChoice;

        do {
            System.out.print("Enter the amount in cents: ");
            int amountInCents = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            // Calculate and print change combinations
            int numberOfCombinations = ChangeCalculator.calculateChange(amountInCents);
            System.out.println("Total number of combinations for " + amountInCents + " cents: " + numberOfCombinations);

            // Print combinations to file
            ChangeCalculator.printCombinationsToFile(amountInCents);
            System.out.println("Combinations have been written to CoinCombinations.txt");

            // Ask the user if they want to continue
            System.out.print("Do you want to enter another amount? (yes/no): ");
            continueChoice = scanner.nextLine().toLowerCase();
        } while (continueChoice.equals("yes"));

        scanner.close();
    }
}