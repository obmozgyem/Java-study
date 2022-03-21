package Archive.HomeWork0203.third;

public class Dogs {

    private String dogName;
    private int age;
    private String coatColor;
    private String sex;



    public Dogs(String dogName, int age, String coatColor, String sex) {
        this.dogName = dogName;
        this.age = age;
        this.coatColor = coatColor;
        this.sex = sex;
    }

   public void eat (String dish, String dogName) {
        System.out.println(this.dogName + " " + dish + " aaaamm");
    }
    @Override
    public String toString() {
        return
                "DogName= " + dogName +
                ", age= " + age +
                ", coatColor= " + coatColor +
                ", sex= " + sex ;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCoatColor() {
        return coatColor;
    }

    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}



