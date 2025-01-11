import java.util.Scanner;

class QuotientAndRemainder {

    // Method to find the quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        // Declare an array to store quotient and remainder
        int[] result = new int[2];
        // Calculate quotient
        result[0] = number / divisor;
        // Calculating remainder
        result[1] = number % divisor;
        // Returning the result
        return result;
    }

    public static void main(String[] args) {
        // Create object of Scanner class
        Scanner input = new Scanner(System.in);

        // Take user input for number and divisor
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();

        // Calculate quotient and remainder
        int[] result = findRemainderAndQuotient(number, divisor);

        // Display the result
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);

        // Close Scanner class
        input.close();
    }
}
