import java.util.Scanner;

class BasicCalculator {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();
        
        // Perform arithmetic operations
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        
        System.out.println("The addition, subtraction, multiplication, and division values of numbers " 
            + num1 + " and " + num2 + " are " 
            + addition + ", " + subtraction + ", " + multiplication + ", and " + division );
        
        input.close();
    }
}
