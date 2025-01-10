import java.util.Scanner;

class LargestOutOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the first number :  ");
        int firstNumber = input.nextInt();

        System.out.print("Enter the second number : ");
        int secondNumber = input.nextInt();

        System.out.print("Enter the third number :  ");
        int thirdNumber = input.nextInt();

        // Initializing results
        boolean isFirstLargest = false;
        boolean isSecondLargest = false;
        boolean isThirdLargest = false;

        // Determining largest number
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            isFirstLargest = true;
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            isSecondLargest = true;
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            isThirdLargest = true;
        }

		// Displaying results
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);

        // Close the scanner
        input.close();
    }
}
