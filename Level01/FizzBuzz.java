import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        // Validate input
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Create a String array to store results
        String[] results = new String[number];

        // Loop from 1 to the number
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                results[i - 1] = "Buzz";
            } else {
                results[i - 1] = String.valueOf(i);
            }
        }

        // Print the results
        System.out.println("FizzBuzz Results:");
        for (int i = 0; i < results.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + results[i]);
        }

        input.close();
    }
}
