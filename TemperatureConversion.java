import java.text.NumberFormat;

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

    private static void printNumber(double d, int minWidth, int fractionDigits) {
        // Note: getNumberInstance() creates a NumberFormat object using local 
        // information about the characters for a decimal point and separators.
        NumberFormat form = NumberFormat.getNumberInstance();
        String output;
        int i;
        int length;

        // Set the number of digits to appear on the right of the decimal.
        if (fractionDigits < 0)
            throw new IllegalArgumentException("fractionDigits < 0:" + fractionDigits);
        
        form.setMinimumFractionDigits(fractionDigits);
        form.setMaximumFractionDigits(fractionDigits);

        // Round and format the number. Added code to handle a Java bug that occurs when fractionDigits
        // is zero.
        output = form.format(d);
        length = output.length();
        if (fractionDigits == 0 && length > 1 && output.charAt(length-2) == '.')
            output = " " + output.substring(0, length-2);
        
        // print any leading spaces and the number itself.
        for (i = output.length(); i < minWidth; i++) {
            System.out.println(' ');
        System.out.println(output);
        }
    }

    private static double celsiusToFahrenheit(double c) {
    
        final double MINIMUM_CELSIUS = -273.16;
        if (c < MINIMUM_CELSIUS) 
            throw new IllegalArgumentException("Argument " + c + " is too low.");
        return (9.0 / 5.0) * c + 32.0;
        }
        
    }

    

