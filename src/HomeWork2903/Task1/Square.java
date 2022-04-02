package HomeWork2903.Task1;

public class Square implements CalculationUtils {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double areaCalculation() {
//
//        if (this.getLength() < 0) {
//            System.out.println("Check value");
//        } else
//

        return this.length * this.length;
    }

    public double perimeterCalculation() {
//
//        if (this.getLength() < 0) {
//            System.out.println("Check value");
//        } else
//
//            System.out.println("Square Perimeter  = " + this.length * 4);
        return this.length * 4;
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return String.format("Square[%.2f]", length);

    }

}