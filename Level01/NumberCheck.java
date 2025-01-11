import java.util.Scanner;

class NumberCheck {

    // Method to check if the number is positive, negative, or zero
    public static int checkNumber(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // Create object of Scanner class
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Check the number
        int result = checkNumber(number);

        // Display the result
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Close Scanner class
        input.close();
    }
}
