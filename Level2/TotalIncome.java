import java.util.Scanner;

class TotalIncome {
	public static void main(String[] args) {
		
		// Creating object of scanner class
		Scanner input = new Scanner(System.in);
		
		// Taking user input for salary 
		System.out.print("Enter salary : ");
		int salary = input.nextInt();
		
		// Taking user input for bonus
		System.out.print("Enter bonus : ");
		int bonus  = input.nextInt();
		
		// Calculate income by adding salary and bonus
		int income = salary + bonus;
		
		// Display result 
		System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + income);
		
		// Scanner class closed
		input.close();
	}
}