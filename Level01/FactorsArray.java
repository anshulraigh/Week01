import java.util.Scanner;

public class FactorsArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number to find its factors: ");
        int number = input.nextInt();

        // Check if the number is positive
        if (number <= 0) {
            System.out.println("Error: Please enter a positive number.");
            return;
        }

        // Initialize variables
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Find factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // If the array is full, resize it
                if (index == maxFactor) {
                    maxFactor *= 2; // Double the array size
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length); // Copy elements
                    factors = temp; // Reassign the array
                }
                // Add the factor to the array
                factors[index++] = i;
            }
        }

        // Display the factors
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        input.close();
    }
}
