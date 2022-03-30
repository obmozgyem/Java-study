package HomeWork2903.Task1;

public class Square implements CalculationUtils {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    public void areaCalculation() {

        System.out.println("Square Area  = " + this.length * this.length);
        return;
    }

    public void perimeterCalculation() {

        System.out.println("Square Perimeter  = " + this.length * 4);
        return;
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}

