public class DayOfWeek {
    public static void main(String[] args) {
        // Ensure the correct number of arguments are provided
        if (args.length != 3) {
            System.out.println("Please provide three arguments: month, day, and year.");
            return;
        }

        // Parse command-line arguments
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        // Validate the input
        if (m < 1 || m > 12) {
            System.out.println("Invalid month. Please enter a value between 1 and 12.");
            return;
        }
        if (d < 1 || d > 31) {
            System.out.println("Invalid day. Please enter a value between 1 and 31.");
            return;
        }
        if (y < 1582) {
            System.out.println("Invalid year. The Gregorian calendar is valid only for years >= 1582.");
            return;
        }

        // Calculations for the day of the week
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Output the result
        System.out.println("Day of the week (0 for Sunday, 1 for Monday, ..., 6 for Saturday): " + d0);
    }
}
