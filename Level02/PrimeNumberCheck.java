import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initialize isPrime to true
        boolean isPrime = true;

        // Checking if the number is greater than 1
        if (number <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        } else {
            // Loop through all numbers from 2 to number-1
            for (int i = 2; i <= number / 2; i++) {
                // If number is divisible by any number between 2 and number/2
                if (number % i == 0) {
                    isPrime = false; // Number is divisible, so not a prime
                    break; // No need to check further
                }
            }
		}
        // Output the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        input.close();
    }
}
