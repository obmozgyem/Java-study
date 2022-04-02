package HomeWork2903.Task2;

//Автор – тоже класс, содержит имя, фамилию, возраст.
public class Authors {
    private String name;
    private String surname;
    private int age;

    public Authors(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {

//        while (this.age < 15) {
//            System.out.println("Parameters can't be correct");
//            break;
//
//        }
        return this.age;

    }

    public void setAge(int age) {

        this.age = age;
    }

    @Override
    public String toString() {
        return "Author[" +
                "name= " + name +
                ", surname= " + surname +
                ", age=" + age +
                ']';
    }
}


