class DiscountedFee {
	public static void main(String[] args) {
        
		int fee = 125000, discountPercent = 10;
		
		// Calculating discounted amount 
		int discountAmount = fee * 10 / 100;
		
		// Calculating discounted fee 
		int discountedFee = fee - discountAmount;
		
		System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + discountedFee);
    }
}