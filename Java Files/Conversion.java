//program for converting 1/2 mile and 1/2 gallon of milk to different units of measurements
public class Conversion {
	public static void main(String[] args) {

		double halfMile = 0.5;
		
		double yards = halfMile * 1760.0;
		double feet = yards * 3.0;
		double inches = feet * 12.0;

		double millimeters = inches * 25.4;
		double centimeters = millimeters * 0.1;
		double meters = centimeters * 0.01;
		double kilometers = meters * 0.001;

		System.out.format("1/2 a mile is:\n\n%.2f miles\n%.2f yards\n%.2f feet\n%.2f inches\n%.2f millimeters\n%.2f centimeters\n%.2f meters\n%.2f kilometers\n\n", halfMile, yards, feet, inches, millimeters, centimeters, meters, kilometers);
		
		double halfGallon = 0.5;

		double quarts = halfGallon * 4;
		double pints = quarts * 2;
		double flOz = pints * 16;
		double liters = halfGallon * 3.78541;
		double milliliters = liters * 1000;

		System.out.format("1/2 gallon of milk is:\n\n%.2f gallons\n%.2f quarts\n%.2f pints\n%.2f fluid ounces\n%.2f liters\n%.2f milliliters\n", halfGallon, quarts, pints, flOz, liters, milliliters);

	}
}