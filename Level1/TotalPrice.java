import java.util.*;

class TotalPrice {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		// Unit price of a product
		System.out.print("Enter unit price : ");
		int unitPrice = input.nextInt();
		
		//Asking for number of quantity	
		System.out.print("Enter quantity : ");
		int quantity = input.nextInt();
		
		// Total Purchase
		int totalPurchase = unitPrice * quantity;
		
		System.out.println("The total purchase price is INR " + totalPurchase + " if the quantity "+ quantity + " and unit price is INR " + unitPrice);
		
		input.close();
		
	}
}
