class DistanceConverter {
    // Constant for the conversion factor
    private static final double KM_TO_MILE_CONVERSION_FACTOR = 1.6;

    public static void main(String[] args) {
        double distanceInKm = 10.8;

        // Convert distance and store the result
        double distanceInMiles = convertKmToMiles(distanceInKm);

        System.out.println("The distance " + distanceInKm + " km in miles is " + distanceInMiles);
    }

    // Method to convert kilometers to miles
    private static double convertKmToMiles(double kilometers) {
        return kilometers * KM_TO_MILE_CONVERSION_FACTOR;
    }
}