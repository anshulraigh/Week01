import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        // Define an array for storing the ages of 10 students
        int[] ages = new int[10];
        Scanner input = new Scanner(System.in);

        // Take user input for the ages of 10 students
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Student " + (i + 1) + " age: ");
            ages[i] = input.nextInt();
        }

        // Check the voting eligibility for each student
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("Invalid age for Student " + (i + 1) + ": " + ages[i]);
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }

        input.close();
    }
}