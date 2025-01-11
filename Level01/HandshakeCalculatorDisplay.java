import java.util.Scanner;

class HandshakeCalculatorDisplay {

    // Method to calculate the maximum number of handshakes
    public static int calculateMaximumHandshakes(int numberOfStudents) {
        // Calculate and returning the number of handshakes
        return numberOfStudents * (numberOfStudents - 1) / 2;
    }

    public static void main(String[] args) {
        // Create object of Scanner class
        Scanner input = new Scanner(System.in);

        // Take user input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Calculate the maximum number of handshakes
        int maxHandshakes = calculateMaximumHandshakes(numberOfStudents);

        // Display the result
        System.out.println("The number of possible handshakes is " + maxHandshakes);

        // Close Scanner class
        input.close();
    }
}
