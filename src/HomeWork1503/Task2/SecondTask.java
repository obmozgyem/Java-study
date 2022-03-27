package HomeWork1503.Task2;

import java.util.List;

public class SecondTask {
    public static void main(String[] args) {
        PersonList personlist = new PersonList();
//        personlist.getList().add(1,"2222");

        personlist.addPerson(new PersonTask2("person1", 1));
        personlist.addPerson(new PersonTask2("person2", 2));
        personlist.addPerson(new PersonTask2("person2", 3));
        personlist.addPerson(new PersonTask2("person3", 4));
        personlist.addPerson(new PersonTask2("person4", 5));

        List<PersonTask2> result = personlist.getPersonByName("person7");
//        System.out.println(result.toString());
        System.out.println(result.isEmpty() ? "no person with this name" : result.toString());

    }

}
