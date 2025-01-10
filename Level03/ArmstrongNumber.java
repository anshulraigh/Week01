import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();
		
        // Defining variables
        int originalNumber = number;
        int sum = 0;
        // Looping through each digit of the number
        while (number != 0) {
            // Getting the last digit of the number using modulus operator
            int digit = number % 10;

            // Calculating the cube of the digit and adding it to sum
            sum += Math.pow(digit, 3);

            // Removing the last digit from the number
            number /= 10;
        }
        // Checking if the sum is equal to the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
        input.close();
    }
}
