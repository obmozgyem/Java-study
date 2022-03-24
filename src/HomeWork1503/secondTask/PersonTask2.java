package HomeWork1503.secondTask;

//Создать класс Person с полем String name.
//        В другом классе создать поле List<Person> persons.
//        Записать в список 5 экземпляров класса Person.Создать метод,который будет
//        принимать параметр String name и возвращать из списка объект Person
//        с таким именем(либо null,если человека с таким именем нет в списке).
//        После этого вызвать у получившегося объекта метод toString().

public class PersonTask2 {
    private String name;
    private int index;

    public PersonTask2(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return name + ": " + "index: "+ index;
    }
}


