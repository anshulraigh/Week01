import java.util.Scanner;

class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter values for a, b, and c
        System.out.print("Enter value for a: ");
        int a = input.nextInt();
        
        System.out.print("Enter value for b: ");
        int b = input.nextInt();
        
        System.out.print("Enter value for c: ");
        int c = input.nextInt();

        // Performing the operations following the operator precedence
        int result1 = a + b * c;   // Multiplication (*) has higher precedence than addition (+)
        int result2 = a * b + c;   // Multiplication (*) has higher precedence than addition (+)
        int result3 = c + a / b;   // Division (/) has higher precedence than addition (+)
        int result4 = a % b + c;   // Modulus (%) has higher precedence than addition (+)

        // Display the results
        System.out.println("The results of Int Operations are: " + result1 + ", " + result2 + ", " + result3 + " and " + result4);
		
		input.close();
    }
}