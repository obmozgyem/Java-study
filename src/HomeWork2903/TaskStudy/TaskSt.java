package HomeWork2903.TaskStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Есть список. В нем лежат другие списки. В этих списках лежат строки.
Вывести на консоль эти строки поочередно,
т.е. сначала 1ю строку из первого списка, потом 1ю строку из 2го списка, и т.д.
 */
public class TaskSt {

    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("String 1", "String 5", "String 8", "String 11");
        List<String> list2 = Arrays.asList("String 2");
        List<String> list3 = Arrays.asList("String 3", "String 6", "String 9", "String 12");
        List<String> list4 = Arrays.asList("String 4", "String 7", "String 10");

        List<List<String>> allList = Arrays.asList(list1, list2, list3, list4);
//
//        for (int i = 0; i < allList.size(); i++) {
//
//            for (int j = 0; j < ; j++) {
//
//            }
//
//        }



    }
}
