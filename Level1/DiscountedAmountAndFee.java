import java.util.Scanner;
class DiscountedAmountAndFee {
	public static void main(String[] args) {
		
		// Creating Object for Scanner class
		Scanner input = new Scanner(System.in);
		
		
		// Taking user input for fee
		System.out.print("Enter fee amount : ");
		int fee = input.nextInt();
		
		// Taking user input for discountPercent
		System.out.print("Enter discount percent : ");
		int discountPercent = input.nextInt();
		
		// Calculate discount amount
	    int discountAmount = (fee*discountPercent)/100;
		
		// Calculate discount fee
		int discountedFee = fee - discountAmount;
		
		// Display result
		System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + discountedFee);
		
		// Scanner class closed
		input.close();
		
	}
}