package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GeometryFigureTest {
    @Test
    public void testTriangleArea(){
        GeometryFigure.Triangle triangle = new GeometryFigure().new Triangle(5, 4);
        Assertions.assertEquals(10,triangle.getArea());
    }

    @Test
    public void testSquareArea(){
        GeometryFigure.Square square = new GeometryFigure().new Square(4);
        Assertions.assertEquals(16, square.getArea());
    }

    @Test
    public  void testRectangleArea(){
        GeometryFigure.Rectangle rectangle = new GeometryFigure().new Rectangle(5,4);
        Assertions.assertEquals(20, rectangle.getArea());
    }

    @Test
    public void testRhombusArea(){
        GeometryFigure.Rhombus rhombus = new GeometryFigure().new Rhombus(8,8);
        Assertions.assertEquals(32,rhombus.getArea());
    }
}
