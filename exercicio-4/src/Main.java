public class Main {
    public static double celsiusToFahrenheit(double celsius) {

        return (9.0/5.0) * celsius + 32;
    }

    public static void main(String[] args) {
        System.out.println("| Celsius (°C) | Fahrenheit (°F) |");
        System.out.println("|-------------|----------------|");

        for (int celsius = -80; celsius <= 80; celsius += 10) {
            double fahrenheit = celsiusToFahrenheit(celsius);

            System.out.printf("| %11d | %14.1f |\n", celsius, fahrenheit);
        }
    }
}