package org.example;

public class LengthConverter {
    public static double millimetersToCentimeters(double millimeters) {
        return millimeters / 10.0;
    }

    public static double centimetersToMillimeters(double centimeters) {
        return centimeters * 10.0;
    }

    public static double centimetersToDecimeters(double centimeters) {
        return centimeters / 10.0;
    }

    public static double decimetersToCentimeters(double decimeters) {
        return decimeters * 10.0;
    }

    public static double metersToCentimeters(double meters) {
        return meters * 100.0;
    }

    public static double centimetersToMeters(double centimeters) {
        return centimeters / 100.0;
    }

    public static double kilometersToMeters(double kilometers) {
        return kilometers * 1000.0;
    }

    public static double metersToKilometers(double meters) {
        return meters / 1000.0;
    }
}
