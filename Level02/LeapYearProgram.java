import java.util.Scanner;

public class LeapYearProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Checking if the year is greater than or equal to 1582 (Gregorian calendar)
        if(year < 1582){
            System.out.println("Year must be greater than or equal to 1582 (Gregorian calendar).");
        }else{
            // Part 1: Using multiple if-else statements
            if(year % 400 == 0){
                System.out.println(year + " is a Leap Year.");
            }else if (year % 100 == 0) {
                System.out.println(year + " is not a Leap Year.");
            }else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year.");
            }else {
                System.out.println(year + " is not a Leap Year.");
            }
        }

        input.close();
    }
}
