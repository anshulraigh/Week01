class AveragePercentageInPcm{
	public static void main(String[] args){
		
		String name = "Sam";
		
		double maths = 94, physics = 95, chemistry = 96;
		
		double totalMarks = maths + physics + chemistry;
		
		// Calculating percentage
		double percentage = totalMarks * 100/300;
		
		// Displaying result
		System.out.println(name +"'s average mark in PCM is " + percentage);
	}
}