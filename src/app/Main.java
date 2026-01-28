package app;

import java.util.Arrays;

public class Main {

    private static final double CONV_TEMPER = 1.8;

    static void main(String[] args) {
        System.out.println("functionality for converting " +
                "Fahrenheit to Celsius," +
                " Celsius to Fahrenheit");

        double fahrenheit = 50;
        double celsius = convFahrToCels(fahrenheit);
        System.out.println("Result is " + fahrenheit + " fahrenheit degree equals " + celsius +
                " celsius degree. ");

    }

    public static double convFahrToCels(double fahr) {
        return (fahr - 32) / CONV_TEMPER;
    }
}
