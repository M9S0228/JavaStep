package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConvertorTest {
    Convertor convertor = new Convertor(3000);
    @Test
    public void testUsd(){
        Convertor.Dollar dollar = convertor.new Dollar();
        Assertions.assertEquals(dollar.getUAHtoUSD(), 78.125, "3000 UAH -> 78.125$");
    }
    @Test
    public void testEuro(){
        Convertor.Euro euro = convertor.new Euro();
        Assertions.assertEquals(euro.getUAHtoEuro(), 73.52941176470588);
    }

    @Test
    public void testPound(){
        Convertor.Pound pound = convertor.new Pound();
        Assertions.assertEquals(pound.getUAHtoPound(), 71.59904534606206);
    }
    @Test
    public void testYen(){
        Convertor.Yen yen = convertor.new Yen();
        Assertions.assertEquals(yen.getUAHtoYen(), 12030.0);
    }
}
