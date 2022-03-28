package HomeWork1503.Task4;

/*Создать класс с одним полем [например, class Entity {private String name; // конструктор, геттер, сеттер, toString} ]
Записать в список ArrayList 5 экземпляров этого класса.
Создать метод, который принимает String как параметр и возвращает из списка объект Entity,
у которого поле name совпадает с переданным параметром.
Например, public static Entity getByName(String name) {//реализация}
*/

import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        EntityList arrayList = new EntityList();
        arrayList.addIntity(new Entity("Ivan", 1));
        arrayList.addIntity(new Entity("Petr", 2));
        arrayList.addIntity(new Entity("Ivan", 3));
        arrayList.addIntity(new Entity("Sveta", 4));
        arrayList.addIntity(new Entity("Pavel", 5));

        List<Entity> result = arrayList.getByName("Pav");
        System.out.println(result.isEmpty() ? "no person with this name" : result.toString());


    }
}
