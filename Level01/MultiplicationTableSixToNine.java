import java.util.Scanner;

public class MultiplicationTableSixToNine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number to find its multiplication table (from 6 to 9): ");
        int number = input.nextInt();

        // Define an array to store results
        int[] multiplicationResult = new int[4]; // To store results for multipliers 6 to 9

        // Calculate multiplication table for 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i; // Store results in the array
        }

        // Display the multiplication table
        System.out.println("\nMultiplication table of " + number + " (from 6 to 9):");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

        input.close();
    }
}
