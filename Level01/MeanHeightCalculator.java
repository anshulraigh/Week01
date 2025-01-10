import java.util.Scanner;

public class MeanHeightCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define an array to store heights of 11 players
        double[] heights = new double[11];
        double sum = 0.0;

        // Take user input for the heights of the players
        System.out.println("Enter the heights of 11 football players (in cm):");
        for (int i = 0; i < 11; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
            sum += heights[i]; // Add each height to the sum
        }

        // Calculate the mean height
        double mean = sum / 11;

        // Print the mean height
        System.out.printf("\nThe mean height of the football team is: %.2f cm\n", mean);

        input.close();
    }
}
