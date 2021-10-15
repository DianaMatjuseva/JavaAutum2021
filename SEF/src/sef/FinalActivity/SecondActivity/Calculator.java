package sef.FinalActivity.SecondActivity;

public class Calculator {

    public static int sum(int number1, int number2) {
        return number1 + number2;
    }

    public static int sub(int number1, int number2) {
        return number1 - number2;
    }

    public static double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public static double divide(double number1, double number2) {
        if (number2 == 0 || number1 == 0) {
            throw new IllegalArgumentException("Forbidden divide by 0!");
        }
        return number1 / number2;
    }
}
