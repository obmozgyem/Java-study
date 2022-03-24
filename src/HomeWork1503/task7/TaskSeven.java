package HomeWork1503.task7;

 /*Реализовать «частотный словарь символов». Есть какая-то строка.
 Посчитать, сколько раз каждый символ встречается в строке.
 Вывести на консоль результат подсчетов. В задаче используется какая-то из реализаций интерфейса Map.
 Чтобы получить массив символов из строки, используйте str.toCharArray().
  */

import java.util.HashMap;
import java.util.Map;

public class TaskSeven {

    public static void main(String[] args) {

        String stroka = "mama, myla, ramu!";

        Map<Character, Integer> map = new HashMap<>();

        for (char c : stroka.toCharArray()) {
            if (!map.containsKey(c))
                map.put(c, 1);
            else
                map.put(c, map.get(c) + 1);
//            System.out.print(c);

        }
        System.out.println(map);
//        map.forEach((k,v) -> System.out.printf("[%s] : %d", k, v));
        map.forEach((k,v) -> System.out.printf("[%s] : %d\n", k, v));

    }
}
