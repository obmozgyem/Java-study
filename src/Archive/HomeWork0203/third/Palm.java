package Archive.HomeWork0203.third;

public class Palm extends Mike{
    private int feet;

    public Palm(String dogName, int age, String coatColor, String sex, String whereHome, int feet) {
        super(dogName, age, coatColor, sex, whereHome);
        this.feet = feet;
    }

    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    @Override
    public String toString() {
        return  super.toString() + "  " +
                "prickEars='" + feet + '\'' +
                '}';
    }
}
