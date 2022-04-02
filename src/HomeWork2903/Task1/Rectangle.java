package HomeWork2903.Task1;

public class Rectangle extends Square {

    private double width;

    public Rectangle(double length, double width) {
        super(length);
        this.width = width;
    }


    @Override
    public double areaCalculation() {
//        if (this.getWidth() < 0 || this.getLength() < 0) {
//            System.out.println("Check value");
//        }
//        else
//
//        System.out.println("Square Rectangle = " + this.getWidth() * this.getLength());
        return this.getWidth() * this.getLength();
    }

    @Override
    public double perimeterCalculation() {
//
//        if (this.getWidth() < 0 || this.getLength() < 0) {
//            System.out.println("Check value");
//        }
//        else
//
//        System.out.println("Perimeter Rectangle  = " + (this.getLength()*2  + this.getWidth()*2));
        return this.getLength()*2  + this.getWidth()*2;
    }


    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return String.format("Rectangle[%.2f,%.2f]", getLength(), getWidth());
    }
}
