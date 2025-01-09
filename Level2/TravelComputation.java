import java.util.Scanner;

class TravelComputation {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // Taking inputs for name, cities, and distances
      System.out.print("Enter name: ");
      String name = input.nextLine();
      
      System.out.print("Enter the starting city: ");
      String fromCity = input.nextLine();
      
      System.out.print("Enter the via city: ");
      String viaCity = input.nextLine();
      
      System.out.print("Enter the destination city: ");
      String toCity = input.nextLine();

      System.out.print("Enter distance from " + fromCity + " to " + viaCity + " : ");
      double distanceFromToVia = input.nextDouble();
      
      System.out.print("Enter time taken from " + fromCity + " to " + viaCity + " : ");
      int timeFromToVia = input.nextInt();
      
      System.out.print("Enter distance from " + viaCity + " to " + toCity + " : ");
      double distanceViaToFinalCity = input.nextDouble();
      
      System.out.print("Enter time taken from " + viaCity + " to " + toCity + " : ");
      int timeViaToFinalCity = input.nextInt();

      // Calculate total distance and time
      double totalDistance = distanceFromToVia + distanceViaToFinalCity;
      int totalTime = timeFromToVia + timeViaToFinalCity;

      // Print travel details
      System.out.println("The total distance travelled by " + name + " from " + fromCity + " to " + toCity + 
                         " via " + viaCity + " is " + totalDistance + " miles and the total time taken is " + 
                         totalTime + " minutes.");
						 
		input.close();
   }
}
