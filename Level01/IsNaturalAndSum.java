import java.util.Scanner;

class IsNaturalAndSum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		// Taking input from user
		System.out.print("Enter the number : ");
		int inputNumber = input.nextInt();
		
        // Checking if the number is a natural number
        if (inputNumber > 0) {
		
            // Calculating the sum of the first n natural numbers
            int sumOfNaturalNumbers = inputNumber * (inputNumber + 1) / 2;
            System.out.println("The sum of the first " + inputNumber + " natural numbers is " + sumOfNaturalNumbers);
        } else {
            System.out.println("The number is not a natural number");
        }
		
		input.close();
    }
}
