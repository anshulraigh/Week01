class FindingAge{
	public static void main(String[] args){
		
		String name = "Harry";
		
		int birthYear = 2000, currentYear = 2024;
		
		// Calculating current age
		int currentAge = currentYear - birthYear;
		
		// Displaying result
		System.out.println(name + "'s age in " + currentYear + " is " + currentAge);
	}
}