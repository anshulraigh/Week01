import java.util.Scanner;

class DoubleOpt {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Asking user to enter values for a, b, and c
        System.out.print("Enter value for a (double): ");
        double a = input.nextDouble();
        
        System.out.print("Enter value for b (double): ");
        double b = input.nextDouble();
        
        System.out.print("Enter value for c (double): ");
        double c = input.nextDouble();

        // Performing the operations following the operator precedence
        double result1 = a + b * c;   // Multiplication (*) has higher precedence than addition (+)
        double result2 = a * b + c;   // Multiplication (*) has higher precedence than addition (+)
        double result3 = c + a / b;   // Division (/) has higher precedence than addition (+)
        double result4 = a % b + c;   // Using the remainder operation

        // Display the results
        System.out.println("The results of Int Operations are: " + result1 + ", " + result2 + ", " + result3 + " and " + result4);
		
		input.close();
    }
}
