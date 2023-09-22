
package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeightConverterTest {
    @Test
    public void testMilligramsToGrams() {
        double milligrams = 1000.0;
        double grams = WeightConverter.milligramsToGrams(milligrams);
        assertEquals(1.0, grams, 0.01);
    }

    @Test
    public void testGramsToMilligrams() {
        double grams = 1.0;
        double milligrams = WeightConverter.gramsToMilligrams(grams);
        assertEquals(1000.0, milligrams, 0.01);
    }

    // І так далі......
}
