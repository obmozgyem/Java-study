package HomeWork1503.Task3;


import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.sort;

/*
Есть список строк. Создать одну строку, состоящую из элементов списка, длина которых менее 5 символов,
через пробел, и вывести ее на консоль. (использовать List<String>, StringBuilder)
Пример: список строк {“aaa”, “bbb”, “qwerty”, “”, “.”,”abcde”,“ccc”} => Вывод: “aaa bbb  . ccc”
 */
public class Task3 {

    public static void main(String[] args) {

        List<String> list2 = new ArrayList<>();
        list2.add("aaa");
        list2.add("bbb");
        list2.add("qwerty");
        list2.add(".");
        list2.add("abcde");
        list2.add("ccc");
        list2.add("abcdef");
        list2.add("++");
        StringBuilder sb = new StringBuilder();
        for (String s : list2) { // мы "проходимся" по строкам коллекции
            if (s.length() < 5) {   // проверили длину элемента
                sb.append(s + " ");  // если <5, то записываем в стрингбилдер плюс пробел
                System.out.print(s + " ");
            }
        }
//
//        StringBuilder sb1 = new StringBuilder("aaa");
//        StringBuilder sb2 = new StringBuilder("bbb");
//        StringBuilder sb3 = new StringBuilder("qwerty");
//        StringBuilder sb4 = new StringBuilder(".");
//        StringBuilder sb5 = new StringBuilder("abcde");
//        StringBuilder sb6 = new StringBuilder("ccc");
//
//        if (sb1.length() < 5)
//            System.out.print(sb1 + " ");
//        if (sb2.length() < 5)
//            System.out.print(sb2 + " ");
//        if (sb3.length() < 5)
//            System.out.print(sb3 + " ");
//        if (sb4.length() < 5)
//            System.out.print(sb4 + " ");
//        if (sb5.length() < 5)
//            System.out.print(sb5 + " ");
//        if (sb6.length() < 5)
//            System.out.print(sb6 + " ");
//        System.out.println();


    }
}

