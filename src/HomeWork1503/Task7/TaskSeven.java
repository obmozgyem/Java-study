package HomeWork1503.Task7;

 /*Реализовать «частотный словарь символов». Есть какая-то строка.
 Посчитать, сколько раз каждый символ встречается в строке.
 Вывести на консоль результат подсчетов. В задаче используется какая-то из реализаций интерфейса Map.
 Чтобы получить массив символов из строки, используйте str.toCharArray().
  */

import java.util.HashMap;

import java.util.Map;

public class TaskSeven {
    public static final String SYMBOLS = ",.!?#:";

    public static void main(String[] args) {


        String stroka = "!!Leading,, and## Trailing:: Spaces;;";

        String strokaUpper = stroka.toUpperCase();

        System.out.println(strokaUpper);

        String strokaUpper2 = strokaUpper.replaceAll("[#!,.;:$]", "*");

        System.out.println(strokaUpper2);


        Map<Character, Integer> map = new HashMap<>();

        for (char key : strokaUpper2.toCharArray()) {
            if (!map.containsKey(key))
                map.put(key, 1);
            else
                map.put(key, map.get(key) + 1);
//           System.out.print(key);

        }
        System.out.println(map);

//        map.forEach((k,v) -> System.out.printf("[%s] : %d\n", k, v));
    }
}


