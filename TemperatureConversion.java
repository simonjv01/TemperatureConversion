public class TemperatureConversion {
    
    public static void main(String[] args) {
        
        // Declare values that control the table's bounds.
        final double TABLE_BEGIN = -50.0; 
        final double TABLE_END = 50.0;
        final double TABLE_STEP = 10.0;
        final int WIDTH = 6;
        final int ACCURACY = 2;

        double celsius;
        double fahrenheit;

        System.out.println("TEMPERATURE CONVERSION");
        System.out.println("-----------------------");
        System.out.println("Celsius      Fahrenheit");

        for (celsius = TABLE_BEGIN; celsius <= TABLE_END; celsius += TABLE_STEP) {
            // tHE for-loop has set celsius equal to the next celsius value of the table.
            fahrenheit = celsiusToFahrenheit(celsius);
            printNumber(celsius, WIDTH, ACCURACY);
            System.out.println("C      ");
            printNumber(fahrenheit, WIDTH, ACCURACY);
            System.out.println("F");
        }
        System.out.println("-----------------------");
        }
    }
    
}
