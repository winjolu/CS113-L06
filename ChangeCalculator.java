
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * ChangeCalculator : Class containing the recursive method calculateChange, which determines and prints all
 * possible coin combinations representing a given monetary value in cents.
 *
 * Problem derived from Koffman & Wolfgang's Data Structures: Abstraction and Design Using Java (2nd ed.):
 * Ch. 5, Programming Project #7, pg. 291.
 *
 * NOTE: An additional method, printCombinationsToFile(int), has been added for the equivalent tester file to
 * verify that all given coin combinations are unique.
 */
//public class ChangeCalculator {

    // List for storing all possible combinations.

    // Coins used in counting total number of combinations.



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
//    public static int calculateChange(int cents) {
//        // TODO:
//        // Implement a recursive solution following the given documentation.
//
//        return calculateChange(cents, 0);
//    }

    /**
     * Calls upon calculateChange(int) to calculate and print all possible unique combinations of quarters, dimes,
     * nickels, and pennies that equal the given value in cents.
     *
     * Similar to calculateChange's function in printing each combination to the console, this method will also
     * produce a text file named "CoinCombinations.txt", writing each combination to separate lines.
     *
     * @param cents a monetary value in cents
     */
//    public static void printCombinationsToFile(int cents) {
//        // TODO:
//        // This when calculateChange is complete. Note that the text file must be created within this directory.
//
//
//    }




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
     * @return number of possible ways to make change.
     */


    /**
     * Calculates the total possible combinations.
     *
     * @param amount monetary currency in cents.
     * @param coinHolder position of coin used from the coins array.
     * @return the total number of combinations.
     */


    /**
     * Adds the combination to the array list.
     *
     * @param q number of quarters.
     * @param d number of dimes.
     * @param n number of nickels.
     * @param p number of pennies.
     */


//} // End of class ChangeCalculator