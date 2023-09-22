package org.example;

public class GeometryFigure {
    public class Triangle{
        private double base;
        private double height;

        public Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }
        public double getArea(){
            return 0.5 * base * height;
        }
    }
    public class Square{
        private double size;

        public Square(double size) {
            this.size = size;
        }
        public double getArea(){
            return size * size;
        }
    }

    public class Rectangle{
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getArea(){
            return width * height;
        }
    }
    public class Rhombus {
        private double diagonal1;
        private double diagonal2;

        public Rhombus(double diagonal1, double diagonal2) {
            this.diagonal1 = diagonal1;
            this.diagonal2 = diagonal2;
        }
        public double getArea(){
            return (diagonal1 * diagonal2) / 2;
        }
    }
}
