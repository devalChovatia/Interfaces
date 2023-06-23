import java.awt.desktop.OpenFilesEvent;

public class Main {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[8];

        Circle circle = new Circle(5, 5, 5);
        Circle circle2 = new Circle(8, 8, 3);
        Pentagon pentagon = new Pentagon(16, 18, 8);
        Pentagon pentagon2 = new Pentagon(24, 14, 5);
        Square square = new Square(20, 15, 10);
        Square square2 = new Square(12, 8, 4);
        Triangle triangle = new Triangle(8, 16, 6);
        Triangle triangle2 = new Triangle(1, 40, 20);

        shapes[0] = circle;
        shapes[1] = circle2;
        shapes[2] = pentagon;
        shapes[3] = pentagon2;
        shapes[4] = square;
        shapes[5] = square2;
        shapes[6] = triangle;
        shapes[7] = triangle2;

        for (int i = 0; i < 8; i++) {
            if (shapes[i] instanceof Circle) ((Circle) shapes[i]).area();
            if (shapes[i] instanceof Circle) ((Circle) shapes[i]).perimeter();
            if (shapes[i] instanceof Circle) ((Circle) shapes[i]).newLocation(10, 2);

            if (shapes[i] instanceof Pentagon) ((Pentagon) shapes[i]).area();
            if (shapes[i] instanceof Pentagon) ((Pentagon) shapes[i]).perimeter();
            if (shapes[i] instanceof Pentagon) ((Pentagon) shapes[i]).newLocation(3, 7);

            if (shapes[i] instanceof Square) ((Square) shapes[i]).area();
            if (shapes[i] instanceof Square) ((Square) shapes[i]).perimeter();
            if (shapes[i] instanceof Square) ((Square) shapes[i]).newLocation(7, 15);

            if (shapes[i] instanceof Triangle) ((Triangle) shapes[i]).area();
            if (shapes[i] instanceof Triangle) ((Triangle) shapes[i]).perimeter();
            if (shapes[i] instanceof Triangle) ((Triangle) shapes[i]).newLocation(9, 23);
        }

        System.out.println("\nFor further functionality purposes and to display getter/setter methods," +
                "\nBelow are a few instances of using getters\n");
        for (int i = 0; i < 8; i+=2) {

            if (shapes[i] instanceof Circle) {
                System.out.println("The radius of the circle is " + ((Circle) shapes[i]).getRadius());
            }

            if (shapes[i] instanceof Pentagon) {
                System.out.println("The side length of the pentagon is " + ((Pentagon) shapes[i]).getSideLength());
            }

            if (shapes[i] instanceof Square) {
                System.out.println("The centreX of the square is " + ((Square) shapes[i]).getCenterX());
            }

            if (shapes[i] instanceof Triangle) {
                System.out.println("The centreY of the Triangle is " + ((Triangle) shapes[i]).getCenterY());
            }
        }
    }
}
