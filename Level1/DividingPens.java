class DividingPens {
	public static void main(String[] args) {
        
		int numberOfPens = 14, numOfStudents = 3;
		
		// Calculating the no. of pens each student will get
		int pensPerStudent = (numberOfPens/numOfStudents);
		
		// Calculating remaining pens after equal distribution among students
		int remainingPens = (numberOfPens%numOfStudents);
		
		//Displaying result 
		System.out.println("The Pen Per Student is " +  pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}