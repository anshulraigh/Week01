import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Variable to store the count of digits
        int count = 0;

        // Handle negative numbers by converting to positive
        number = Math.abs(number);

        // Loop to count digits
        while (number != 0) {
            number /= 10;  // Remove the last digit
            count++;       // Increment count
        }

        // If number is 0, then the count should be 1 as it has 1 digit
        if (count == 0) {
            count = 1;
        }

        // Display the number of digits
        System.out.println("The number of digits is: " + count);

        input.close();
    }
}
