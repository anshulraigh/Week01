import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Count the number of digits in the number
        int tempNumber = number;
        int count = 0;
        while (tempNumber != 0) {
            tempNumber = tempNumber / 10;
            count++;
        }

        // Create an array to store digits
        int[] digits = new int[count];
        tempNumber = number;
        int index = 0;

        // Store digits in the array
        while (tempNumber != 0) {
            digits[index] = tempNumber % 10;
            tempNumber = tempNumber / 10;
            index++;
        }

        // Create a new array to store the digits in reverse order
        int[] reversedDigits = new int[count];

        // Reverse the array
        for (int i = 0; i < count; i++) {
            reversedDigits[i] = digits[count - 1 - i];
        }

        // Display the reversed number
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reversedDigits[i]);
        }

        input.close();
    }
}
