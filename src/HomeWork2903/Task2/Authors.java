package HomeWork2903.Task2;

import java.util.Objects;

//Автор – тоже класс, содержит имя, фамилию, возраст.
public class Authors {
    public static String name;
    private String surname;
    private int age;

    public Authors() {

    }

    public Authors(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public static String getName() {
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

    @Override
    public boolean equals(Object o) {

        Authors authors = (Authors) o;
        return Objects.equals(name, authors.name) && Objects.equals(surname, authors.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}


