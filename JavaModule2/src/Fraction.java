import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        if (denominator == 0){
            throw new IllegalArgumentException("Знаменик не може бути 0");
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void inputFraction(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть чисельник: ");
        numerator = scanner.nextInt();

        System.out.println("Введіть знаменик: ");
        denominator = scanner.nextInt();
        if(denominator == 0 ){
            System.out.println("Помилка! Знаменик не може бути 0");
        }
    }

    public void simplify(){
        int gcd = gcd(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    private  int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public Fraction add(Fraction other){
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction subtraction(Fraction other){
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }
    public Fraction prod(Fraction other){
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }
    public Fraction division(Fraction other){
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator);
    }
}

