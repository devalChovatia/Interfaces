import static java.lang.Math.PI;

public class Circle implements Shape{
    private double centerX;
    private double centerY;
    private int radius;

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

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(int centerX, int centerY, int radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }
    // Methods -----------------------------------------------------------
    @Override
    public void area(){
        double area = PI * (radius*radius);
        System.out.println("Area of the circle is: " + area);
    }

    @Override
    public void perimeter(){
        double perimeter = 2 * PI * radius;
        System.out.println("Perimeter of the circle is: " + perimeter);
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
