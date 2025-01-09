import java.util.*;

class HeightConversion {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		// height in centi-meter
		System.out.print("Enter height : ");
		int heightInCm = input.nextInt();
		
		// height in foot
		double heightInFoot = heightInCm/30.48;		
		
		// height in inches
		double inch = heightInCm / 2.54;
		
		System.out.println("Your height in cms is " + heightInCm + " while in feet is  " + heightInFoot + " and in inches is " + inch);
		
		input.close();
	}
}