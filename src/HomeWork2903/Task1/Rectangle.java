package HomeWork2903.Task1;

public class Rectangle extends Square {

    private double width;

    public Rectangle(double length, double width) {
        super(length);
        this.width = width;
    }


    @Override
    public void areaCalculation() {
        if (this.getWidth() < 0 || this.getLength() < 0) {
            System.out.println("Check value");
        }
        else

        System.out.println("Square Rectangle = " + this.getWidth() * this.getLength());
        return;
    }

    @Override
    public void perimeterCalculation() {

        if (this.getWidth() < 0 || this.getLength() < 0) {
            System.out.println("Check value");
        }
        else

        System.out.println("Perimeter Rectangle  = " + (this.getLength()*2  + this.getWidth()*2));
        return;
    }


    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
