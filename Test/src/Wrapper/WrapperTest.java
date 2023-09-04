package Wrapper;

public class WrapperTest {
    public static void main(String[] args) {
        Integer val1 = 10;
        Integer val2 = Integer.valueOf(10);
        // Integer val3 = new Integer(10);
        String intString = "123";
        Integer val4 = Integer.parseInt(intString);

        Double doubleVal = 3.14;

        byte byteVal;
        short shortVal;
        int intVal;
        float floatVal;
        long longVal;

        byteVal = doubleVal.byteValue();
        shortVal = doubleVal.shortValue();
        intVal = doubleVal.intValue();
        floatVal = doubleVal.floatValue();
        longVal = doubleVal.longValue();

        System.out.println("Original Double value: " + doubleVal);
        System.out.println("byteValue: " + byteVal);
        System.out.println("shortValue: " + shortVal);
        System.out.println("intValue: " + intVal);
        System.out.println("floatValue: " + floatVal);
        System.out.println("longValue: " + longVal);
    }
}
