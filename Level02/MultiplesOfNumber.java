import java.util.Scanner;

public class MultiplesOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Checking if the input number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            // Looping backward from 100 to 1
            System.out.println("Multiples of " + number + " below 100 are:");
            for (int i = 100; i >= 1; i--) {
                // Check if i is a multiple of the input number
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        }

        input.close();
    }
}
