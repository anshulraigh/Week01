import java.util.Random;
public class StudentMarks {

    // Method to generate random scores for Physics, Chemistry, and Math for each student
    public static int[][] generateScores(int students) {
        Random random = new Random();
        int[][] scores = new int[students][3]; // 2D array to store scores for each student
        for (int i = 0; i < students; i++) {
            // Random scores between 60 to 100 for each subject
            scores[i][0] = random.nextInt(41) + 60; // Physics
            scores[i][1] = random.nextInt(41) + 60; // Chemistry
            scores[i][2] = random.nextInt(41) + 60; // Math
        }
        return scores; // Return the scores array
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        int students = scores.length;
        double[][] results = new double[students][3]; // [Total, Average, Percentage] for each student
        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2]; // Calculate total
            double average = Math.round((double) total / 3 * 100.0) / 100.0; // Calculate average and round off to 2 decimal points
            double percentage = Math.round((double) total / 3.0); // Calculate percentage
            results[i][0] = total; // Store total
            results[i][1] = average; // Store average
            results[i][2] = percentage; // Store percentage
        }
        return results; // Return the results array
    }

    // Method to display the scorecard of all students with their scores, total, average, and percentage
    public static void displayScorecard(int[][] scores, double[][] results) {
        // Display header
        System.out.println("Roll\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            // Display each student's data in tabular format
            System.out.printf("%d\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f%%\n",
                    i + 1, scores[i][0], scores[i][1], scores[i][2], 
                    results[i][0], results[i][1], results[i][2]);
        }
    }

    public static void main(String[] args) {
        int numberOfStudents = 5; // Number of students
        int[][] scores = generateScores(numberOfStudents); // Generate random scores
        double[][] results = calculateResults(scores); // Calculate results
        displayScorecard(scores, results); // Display the scorecard
    }
}
