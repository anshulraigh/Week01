import java.util.Scanner;

class WeightConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input weight in pounds
        System.out.print("Enter weight in pounds: ");
        int weightInPound = input.nextInt();

        // Convert weight to kilograms
        float weightInKg = weightInPound / 2.2f;

        // Print the result
        System.out.println("The weight of the person in pounds is " + weightInPound + " and in kilograms is " + weightInKg);
		
		input.close();
    }
}
