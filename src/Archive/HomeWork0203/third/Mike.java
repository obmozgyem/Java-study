package Archive.HomeWork0203.third;

//где живут стоячие уши или нет
public class Mike extends Dogs {
    private String whereHome;

    public Mike(String dogName, int age, String coatColor, String sex, String whereHome) {
        super(dogName, age, coatColor, sex);
        this.whereHome = whereHome;
    }


    public String getWhereHome() {
        return whereHome;
    }

    public void setWhereHome(String whereHome) {
        this.whereHome = whereHome;
    }

    @Override
    public String toString() {
        return getDogName() + ": " + super.toString() +
                "whereHome='" + whereHome + "  ";
    }
    public void eat (String dish, String dogName) {
        System.out.println(this.getDogName() + " " + dish + " ddffsaaa");
    }

}
