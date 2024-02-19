package util;

public class CurrencyConverter {

    public static final double iof = 6.0;
    public static double conversor(double dollar, double quantity) {
        double value = quantity * dollar;
        return value+= value * iof / 100;

    }

}
