

class Rectangle {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class RectangleDemo {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(8, 4);
        Rectangle r3 = new Rectangle(6, 3);

        System.out.println("Rectangle 1");
        System.out.println("Area: " + r1.calculateArea());
        System.out.println("Perimeter: " + r1.calculatePerimeter());

        System.out.println();

        System.out.println("Rectangle 2");
        System.out.println("Area: " + r2.calculateArea());
        System.out.println("Perimeter: " + r2.calculatePerimeter());

        System.out.println();

        System.out.println("Rectangle 3");
        System.out.println("Area: " + r3.calculateArea());
        System.out.println("Perimeter: " + r3.calculatePerimeter());
    }
}