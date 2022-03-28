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

        String meat = "meat";
        String milk = "milk";
        String solt = "solt";
        String butter = "butter";
        String bread = "bread";

        List<String> buyList = new ArrayList<>();
        buyList.add(meat);
        buyList.add(milk);
        buyList.add(solt);
        buyList.add(butter);
        buyList.add(bread);
        System.out.println(buyList);



        Map<Entity, List<String>> entityMap = new HashMap<Entity, List<String>>();
//        entityMap.put("Vasily", buyList);
//
//              entityMap.put(("Vasily") : new ArrayList<>(){{add.("milk”); add("bread"");}});


    }
}
