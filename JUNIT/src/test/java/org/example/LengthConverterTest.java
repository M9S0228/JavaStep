package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class LengthConverterTest {

    @Test
    public void testMillimetersToCentimeters() {
        double millimeters = 100.0;
        double centimeters = LengthConverter.millimetersToCentimeters(millimeters);
        Assertions.assertEquals(10.0, centimeters, 0.01);
    }

    @Test
    public void testCentimetersToMillimeters() {
        double centimeters = 10.0;
        double millimeters = LengthConverter.centimetersToMillimeters(centimeters);
        assertEquals(100.0, millimeters, 0.01);
    }


    // І так далі......
}
