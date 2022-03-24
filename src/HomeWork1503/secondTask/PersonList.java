package HomeWork1503.secondTask;

import java.util.ArrayList;
import java.util.List;

public class PersonList {

    private List<PersonTask2> list = new ArrayList<>();

    public void addPerson(PersonTask2 person) {
        this.list.add(person);

    }

    public List<PersonTask2> getPersonByName(String name) {
        List<PersonTask2> result2 = new ArrayList<>();
        for (PersonTask2 person : list) {
            if (person.getName().equals(name))
                result2.add(person);

        }
        return result2;

    }


    public List<PersonTask2> getList() {
        return list;
    }
}
