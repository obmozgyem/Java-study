package HomeWork2903.Task1;


public class Circle implements CalculationUtils {

    private double radius;

    public void areaCalculation() {
        if (radius < 0) {
            System.out.println("Check value");
        }
        else
        System.out.println("Square Circle = " + Math.PI* (radius*radius));
        return;
    }

   public void perimeterCalculation() {
       if (radius < 0) {
           System.out.println("Check value ");
       }
       else
        System.out.println("Perimeter Circle = " + Math.PI* (radius*2));
        return;
    }


    public Circle(double radius) {
        this.radius = radius;
    }



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
