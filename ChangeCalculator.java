package edu.miracosta.cs113.change;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ChangeCalculator {

    // List for storing all possible combinations.
    private static List<String> combinations = new ArrayList<>();

    // Coins used in counting total number of combinations.
    private static final int[] coins = {25, 10, 5, 1};

    /**
     * Wrapper method for determining all possible unique combinations of quarters, dimes, nickels, and pennies that
     * equal the given monetary value in cents.
     *
     * In addition to returning the number of unique combinations, this method will print out each combination to the
     * console. The format of naming each combination is up to the user, as long as they adhere to the expectation
     * that the coins are listed in descending order of their value (quarters, dimes, nickels, then pennies). Examples
     * include "1Q 2D 3N 4P", and "[1, 2, 3, 4]".
     *
     * @param cents a monetary value in cents
     * @return the total number of unique combinations of coins of which the given value is comprised
     */
    public static int calculateChange(int cents) {
        combinations.clear();
        calculateChangeHelper(cents, 0, 0, 0, 0);
        for (String combination : combinations) {
            System.out.println(combination);
        }
        return combinations.size();
    }

    /**
     * Calls upon calculateChange(int) to calculate and print all possible unique combinations of quarters, dimes,
     * nickels, and pennies that equal the given value in cents.
     *
     * Similar to calculateChange's function in printing each combination to the console, this method will also
     * produce a text file named "CoinCombinations.txt", writing each combination to separate lines.
     *
     * @param cents a monetary value in cents
     */
    public static void printCombinationsToFile(int cents) {
        calculateChange(cents);
        try (PrintWriter writer = new PrintWriter(new FileOutputStream("CoinCombinations.txt"))) {
            for (String combination : combinations) {
                writer.println(combination);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Helper method that calculates all the different combinations of change possible. Calls addCombination() to add the
     * different combinations to the array list. Is only called when printCombinationsToFile() is called, to save memory and
     * time for each test.
     *
     * @param cents monetary currency in cents.
     * @param q number of quarters.
     * @param d number of dimes.
     * @param n number of nickels.
     * @param p number of pennies.
     */
    private static void calculateChangeHelper(int cents, int q, int d, int n, int p) {
        if (cents == 0) {
            addCombination(q, d, n, p);
            return;
        }
        for (int i = 0; i < coins.length; i++) {
            if (cents >= coins[i]) {
                switch (i) {
                    case 0:
                        calculateChangeHelper(cents - coins[i], q + 1, d, n, p);
                        break;
                    case 1:
                        calculateChangeHelper(cents - coins[i], q, d + 1, n, p);
                        break;
                    case 2:
                        calculateChangeHelper(cents - coins[i], q, d, n + 1, p);
                        break;
                    case 3:
                        calculateChangeHelper(cents - coins[i], q, d, n, p + 1);
                        break;
                }
            }
        }
    }

    /**
     * Adds the combination to the array list.
     *
     * @param q number of quarters.
     * @param d number of dimes.
     * @param n number of nickels.
     * @param p number of pennies.
     */
    private static void addCombination(int q, int d, int n, int p) {
        String combination = "[" + q + ", " + d + ", " + n + ", " + p + "]";
        if (!combinations.contains(combination)) {
            combinations.add(combination);
        }
    }
}