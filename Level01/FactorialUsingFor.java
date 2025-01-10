import java.util.Scanner;

public class FactorialUsingFor{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Checking if the input is a positive integer
        if (number < 0) {
            System.out.println("Please enter a positive integer");
        } else {
            // Computing factorial using a for loop
            int factorial = 1;

            for (int currMultiplier = 1; currMultiplier <= number; currMultiplier++) {
                factorial *= currMultiplier;
            }
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        input.close();
    }
}
