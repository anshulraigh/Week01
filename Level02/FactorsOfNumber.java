import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Checking if the input is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Looping from 1 to the number
            System.out.println("Factors of " + number + " are:");
            for (int i = 1; i <= number; i++) {
                // Check if the number is divisible by i
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }

        input.close();
    }
}
