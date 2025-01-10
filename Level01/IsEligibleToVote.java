import java.util.Scanner;

class IsEligibleToVote{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input of age
        System.out.print("Enter the person's age: ");
        int age = input.nextInt(); // Store the input in the age variable

        // Check if the person is eligible to vote
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote");
        }

        input.close();
    }
}
