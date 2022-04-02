package HomeWork2903.Task1;


public class Circle implements CalculationUtils {

    private double radius;

    public double areaCalculation() {
//        if (radius < 0) {
//            System.out.println("Check value");
//        }
//        else
//        System.out.println("Square Circle = " + Math.PI* (radius*radius));
        return Math.PI* (radius*radius);
    }

   public double perimeterCalculation() {
//       if (radius < 0) {
//           System.out.println("Check value ");
//       }
//       else
//        System.out.println("Perimeter Circle = " + Math.PI* (radius*2));
        return Math.PI* (radius*2);
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

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

}
