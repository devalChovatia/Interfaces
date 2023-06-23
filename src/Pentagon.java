import static java.lang.Math.tan;

public class Pentagon implements Shape{

    private double centerX;
    private double centerY;
    private double sideLength;

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

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }
    public Pentagon(int centerX, int centerY, int sideLength) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.sideLength = sideLength;
    }

    // Methods -----------------------------------------------------------

    @Override
    public void area() {
        double height = (sideLength / 2) / 0.7265;
        double area1 = 0.5 * (sideLength/2) * height;
        double area = 10 * area1;
        System.out.println("Area of the pentagon is: " + area);
    }

    @Override
    public void perimeter() {
        double perimeter = 5 * sideLength;
        System.out.println("Perimeter of the pentagon is: " + perimeter);
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
