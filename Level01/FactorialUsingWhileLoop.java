import java.util.Scanner;

class FactorialUsingWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Checking if the input is a positive integer
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Compute factorial using a while loop
            int factorial = 1;
            int currentMultiplier = 1;

            while (currentMultiplier <= number) {
                factorial *= currentMultiplier;
                currentMultiplier++;
            }

            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        input.close();
    }
}
