package sef.module6.activity;

public class AbstractionActivity {

    public static void main(String[] args) {
        Shape square  = new Square(5);

       square.setColor("Red");
        System.out.println("--- Print the Information for Square ---");
        System.out.println("Color of square:" + square.getColor());
        System.out.println("Area of square:" + square.calculateArea());
        System.out.println("Perimeter of square:" + square.calculatePerimeter());

        Shape rectangle  = new Rectangle(5, 6);

        rectangle.setColor("Green");
        System.out.println("*** Print the Information for Rectangle");
        System.out.println("Color of square:" + rectangle.getColor());
        System.out.println("Area of square:" + rectangle.calculateArea());
        System.out.println("Perimeter of square:" + rectangle.calculatePerimeter());

    }
}


