import java.util.*;

class MaximumHandshakes {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		//Asking to enter no. of people	
		System.out.print("Enter number of people : ");
		int numberOfPeople = input.nextInt();
	
		// total number of handshakes
		int totalHandshake= (numberOfPeople * (numberOfPeople - 1) ) / 2;

		System.out.println("The total number of possible handshakes is " + totalHandshake);
		
		input.close();
	}
}
