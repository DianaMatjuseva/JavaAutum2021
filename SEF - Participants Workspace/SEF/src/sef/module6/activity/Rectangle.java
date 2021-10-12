package sef.module6.activity;

public class Rectangle extends Shape {

    private double lenght;
    private double breath;

    Rectangle(double lenght, double breath) {
        this.lenght = lenght;
        this.breath = breath;
    }

    public double calculateArea() {
        double area = lenght + breath;
        return area;
    }

    public double calculatePerimeter() {
        double perimeter = 2 * calculateArea();
        return perimeter;

    }
}

