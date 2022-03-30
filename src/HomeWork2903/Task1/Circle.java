package HomeWork2903.Task1;


public class Circle implements CalculationUtils {
    private final double PI = 3.1415926536;
    private double radius;

    public void areaCalculation() {
        System.out.println("Square Circle = " + PI* (radius*radius));
        return;
    }

   public void perimeterCalculation() {
        System.out.println("Perimeter Circle = " + PI* (radius*2));
        return;
    }


    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
