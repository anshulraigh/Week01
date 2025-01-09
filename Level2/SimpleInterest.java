import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input for principal, rate, and time
        System.out.print("Enter the principal amount: ");
        int principal = input.nextInt();

        System.out.print("Enter the rate of interest: ");
        int rate = input.nextInt();

        System.out.print("Enter the time duration in years: ");
        int time = input.nextInt();

        // Calculate simple interest
        double interest = (principal * rate * time) / 100.0;

        // Print the result
        System.out.println("The Simple Interest is " + interest + " for Principal " + principal + 
                           ", Rate of Interest " + rate + ", and Time " + time);
		input.close();
    }
}
