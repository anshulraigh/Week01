import java.util.Scanner;

public class FahrenheitConversionToCelsius {
	// Temperature Conversion program, given the temperature in fahrenheit as input outputs the temperature in celsius
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Enter temperature in Fahrenheit
        double fahrenheitTemperature = input.nextDouble();

        // Convert Fahrenheit to Celsius using the formula
        double celsiusConversion = (fahrenheitTemperature - 32) * 5 / 9;

        // Output the result
        System.out.println("The " + fahrenheitTemperature +" fahrenheit is "+ celsiusConversion +" celsius.");

        // Close the scanner object
        input.close();
    }
}
