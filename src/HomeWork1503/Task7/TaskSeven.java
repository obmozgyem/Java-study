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
        // спросить насчёт третьей

        String stroka = "!!Leading,, and## Trailing:: Spaces;;";

        String strokaUpper = stroka.toUpperCase();

        System.out.println(strokaUpper);
//       strokaUpper = strokaUpper.replace("(?:!#:;)", "*");

       String strokaUpper2 =  strokaUpper.replaceAll("!", "*");
        String strokaUpper3 = strokaUpper2.replaceAll("#", "*");
        String strokaUpper4 = strokaUpper3.replaceAll(";", "*");
        String strokaUpper5 = strokaUpper4.replaceAll(":", "*");
        String strokaUpper6 = strokaUpper5.replaceAll(",", "*");
        System.out.println(strokaUpper6);



        Map<Character, Integer> map = new HashMap<>();

        for (char key : strokaUpper6.toCharArray()) {
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


