package org.example;

public class Convertor {
    private double UAH;

    public Convertor(double UAH) {
        this.UAH = UAH;
    }

    public class Dollar{
        private double UAHtoUSD;
        public Dollar() {
            this.UAHtoUSD = UAH / 38.4;
        }

        public double getUAHtoUSD() {
            return UAHtoUSD;
        }
    }
    public class Euro{
        private double UAHtoEuro;
        public Euro() {
            this.UAHtoEuro = UAH / 40.8;
        }

        public double getUAHtoEuro() {
            return UAHtoEuro;
        }
    }
    public class Pound{
        private double UAHtoPound;

        public Pound() {
            this.UAHtoPound = UAH / 41.9;;
        }

        public double getUAHtoPound() {
            return UAHtoPound;
        }
    }
    public class Yen{
        private double UAHtoYen;

        public Yen() {
            this.UAHtoYen = UAH * 4.01;
        }

        public double getUAHtoYen() {
            return UAHtoYen;
        }
    }
}
