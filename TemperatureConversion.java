public class TemperatureConversion {
    
    public static void main(String[] args) {
        
        // Declare values that control the table's bounds.
        final double TABLE_BEGIN = -50.0; 
        final double TABLE_END = 50.0;
        final double TABLE_STEP = 10.0;
        final int ACCURACY = 2;

        System.out.println("TEMPERATURE CONVERSION");
        System.out.printf("%10s | %10s%n", "Celsius", "Fahrenheit");
        System.out.println("-----------+------------");

        String rowFormat = "%10." + ACCURACY + "f | %10." + ACCURACY + "f%n";
        for (double celsius = TABLE_BEGIN; celsius <= TABLE_END + 1e-9; celsius += TABLE_STEP) {
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.printf(rowFormat, celsius, fahrenheit);
        }
    }

    private static double celsiusToFahrenheit(double c) {
        final double MINIMUM_CELSIUS = -273.16;
        if (c < MINIMUM_CELSIUS) {
            throw new IllegalArgumentException("Argument " + c + " is too low.");
        }
        return (9.0 / 5.0) * c + 32.0;
    }

}

    

