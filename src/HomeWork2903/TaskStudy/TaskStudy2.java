package HomeWork2903.TaskStudy;

    /*
создать метод listSum(...), который должен принимать два списка целых чисел, а возвращать список,
состоящий из сумм соответствующих элементов входных списков.
Если мы передали списки разной длины, то для результирующего списка брать длину большего.
Например: передаем списки {1, 5, 3} и {2, -5, 4, 10}, на выходе должны получить список {3, 0, 7, 10}.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskStudy2 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 5, 3);
        List<Integer> list2 = Arrays.asList(2, -5, 4, 10);

        System.out.println(result(list1, list2));
    }

    public static List<Integer> result(List<Integer> list1, List<Integer> list2) {
        List<Integer> listResult = new ArrayList<>();
        int maxLength = Math.max(list1.size(), list2.size());
        int minLength = Math.min(list1.size(), list2.size());
        int result2 = 0;

        for (int i = 0; i < maxLength; i++) {
            if (minLength <= i) {
                result2 = list2.get(i);
            } else {
                result2 = list1.get(i) + list2.get(i);
            }

            listResult.add(result2);

        }
        return listResult;
    }
}
