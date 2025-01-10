import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Variable to store the sum of divisors
        int sum = 0;

        // Loop to find divisors and sum them up
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {  // Check if i is a divisor of number
                sum += i;  // Add divisor to sum
            }
        }

        // Check if sum of divisors is greater than the number itself
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }

        input.close();
    }
}
