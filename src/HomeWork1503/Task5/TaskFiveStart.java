package HomeWork1503.Task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskFiveStart {
    /*Создадим словарь Map<Entity, List<String>> entityMap = … , то есть словарь хранит пары,
    в которых ключ – объект класса Entity, а значение – список строк.
    Запишем в entityMap 5 пар. например, первая пара [new Entity(“Vasily”) : new ArrayList<>(){{add.(“milk”);add(“bread”);}}]
    вторая пара [new Entity(“Ivan”) : new ArrayList<>(){{add.(“bread”); add.(“butter”); add.(“solt”);}}]
    … и т.д. Будем считать, что это какие-то люди и список их покупок.
    Посчитать, сколько штук каждого продукта всего надо купить и вывести на консоль список покупок по продуктам,
    можно еще отсортировать по алфавиту.
    */

    public static void main(String[] args) {
        List<String> buyList1 = new ArrayList<>();
        buyList1.add("meat");
        buyList1.add("milk");
        buyList1.add("salt");
        buyList1.add("bread");

        List<String> buylist2 = new ArrayList<>();
        buylist2.add("meat");
        buylist2.add("salt");
        buylist2.add("butter");
        buylist2.add("bread");

        List<String> buylist3 = new ArrayList<>();
        buylist3.add("meat");
        buylist3.add("milk");
        buylist3.add("water");
        buylist3.add("bread");

        List<String> buylist4 = new ArrayList<>();
        buyList1.add("meat");
        buyList1.add("milk");
        buyList1.add("salt");
        buyList1.add("beer");

        Entity entity1 = new Entity("Pavel");
        Entity entity2 = new Entity("Ivan");
        Entity entity3 = new Entity("Fedor");
        Entity entity4 = new Entity("Igor");

        Map<Entity, List<String>> entityMap = new HashMap<Entity, List<String>>();
        entityMap.put(entity1, buyList1);
        entityMap.put(entity2, buylist2);
        entityMap.put(entity3, buylist3);
        entityMap.put(entity4, buylist4);

        Map<String, Integer> count = new HashMap<>(); // мы создали новую мапу


        for (List<String> lt : entityMap.values()) {  // теперь заполняем её итерацией по значениям values из мапы entityMap + записываем новый список List lt
            for (String st : lt) {                    //делаем новый цикл и итерируемся уже по записанному значению мапы count с записью  в (String St)
                if (!count.containsKey(st)) {         //если containsKey false то мы записываем покупку(String St) в ключ и 1 в значение count.values
                    count.put(st, 1);
                } else {                              //иначе мы записываем покупку в ту же ячейку, где есть совпадение ключа
                    count.put(st, count.get(st) + 1); //записываем ключ, а потом вызываем уже записанное значение ключа  и прибавляем к нему единицу
                }                                     //цикл завершается
            }
        }
        System.out.println();
        count.forEach((k, v) -> System.out.printf("[%s] : %d\n", k, v));


    }


}

