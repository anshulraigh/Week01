import java.util.Scanner;

public class AthleteRun {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Taking input of the side1 of the triangle
		System.out.print("Enter the 1st of the triangle ");
        double side1 = input.nextDouble();

		// Taking input of the side2 of the triangle
		System.out.print("Enter the 2nd of the triangle ");
        double side2 = input.nextDouble();

		// Taking input of the side3 of the triangle
		System.out.print("Enter the 3rd of the triangle ");
        double side3 = input.nextDouble();

        // Calculating the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Define the total distance to be run (5 km = 5000 meters)
        double totalDistance = 5000;

        // Calculating the no. of rounds required to complete 5 km
        double rounds = totalDistance / perimeter;

        // Displaying the result 
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");

        // Close the scanner object
        input.close();
    }
}
