public class beginnerJavaL1 {

    public static double fahrenheit(double x) {
        double fahr = (x - 32) / 1.8;
        return fahr;
    }

    public static void main(String[] args) {

        double degreesCelsiusInUsa = 0;
        double degreesCelsiusInEurope = 10;
        double degreesCelsiusInAntartica = -50;

        //
        // we want to convert degrees Celsius to Fahrenheit
        //  (degreesCelsius - 32) / 1.8
        //  f(x) = (x - 32) / 1.8
        //
        

        //double degreesFahrenheitInUsa = (degreesCelsiusInUsa - 32) / 1.8;
        double degreesFahrenheitInUsa = fahrenheit(degreesCelsiusInUsa);

        //double degreesFahrenheitInEurope = (degreesCelsiusInEurope - 32) / 1.8;
        double degreesFahrenheitInEurope = fahrenheit(degreesCelsiusInEurope);

        //double degreesFahrenheitInAntartica = (degreesCelsiusInAntartica - 32) / 1.8;
        double degreesFahrenheitInAntartica = fahrenheit(degreesCelsiusInAntartica);

        System.out.println("Fahrenheit in USA: " + degreesFahrenheitInUsa);
        System.out.println("Fahrenheit in Europe: " + degreesFahrenheitInEurope);
        System.out.println("Fahrenheit in Antartica: " + degreesFahrenheitInAntartica);

    }
}
