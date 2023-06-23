import static java.lang.Math.sqrt;

public class Triangle implements Shape {

    private double centerX;
    private double centerY;
    private int sideLength;

    // Getters and Setters -----------------------------------------------
    public double getCenterX() {
        return centerX;
    }

    public void setCenterX(double centerX) {
        this.centerX = centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    public void setCenterY(double centerY) {
        this.centerY = centerY;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    public Triangle(int centerX, int centerY, int sideLength) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.sideLength = sideLength;
    }
    // Methods -----------------------------------------------------------
    @Override
    public void area() {
        double area = (sqrt(3) / 4) * (sideLength * sideLength);
        System.out.println("Area of the triangle is: " + area);
    }

    @Override
    public void perimeter() {
        double perimeter = 3 * sideLength;
        System.out.println("Perimeter of the triangle is: " + perimeter);
    }


    @Override
    public void newLocation(double offsetX, double offsetY) {
        System.out.println("Current location is: " + centerX + ", " + centerY);
        centerX += offsetX;
        centerY += offsetY;
        System.out.println("New location is: " + centerX + ", " + centerY);
        System.out.println("--------------------------------");
    }
}