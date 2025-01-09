import java.util.Scanner;

public class ChocolateDivision {
	
    public static void main(String[] args) {
        // Creating a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Asking user to enter the number of chocolates 
		System.out.print("Enter the number of chocolates ");
        int numberOfChocolates = input.nextInt();
		
		// Asking user to enter the number of children 
		System.out.print("Enter the number of children ");
        int numberOfChildren = input.nextInt();

        // Calculating the number of chocolates each child gets 
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
		
		//	Calculating the number of remaining chocolates
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Displaying the results
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates are " + remainingChocolates);

        // Closing the scanner object
        input.close();
    }
}