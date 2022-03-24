package HomeWork1503.ThirdTask;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static java.util.Collection.*;
import static java.util.Collections.sort;

/*
Есть список строк. Создать одну строку, состоящую из элементов списка, длина которых менее 5 символов,
через пробел, и вывести ее на консоль. (использовать List<String>, StringBuilder)
Пример: список строк {“aaa”, “bbb”, “qwerty”, “”, “.”,”abcde”,“ccc”} => Вывод: “aaa bbb  . ccc”
 */
public class Task3 {


    @Override
    public String toString() {
        return "Task3{}";
    }

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("aaa");
        StringBuilder sb2 = new StringBuilder("bbb");
        StringBuilder sb3 = new StringBuilder("qwerty");
        StringBuilder sb4 = new StringBuilder(".");
        StringBuilder sb5 = new StringBuilder("abcde");
        StringBuilder sb6 = new StringBuilder("ccc");

        if (sb1.length() <5)
                   System.out.print(sb1 + " ");
        if (sb2.length() <5)
            System.out.print(sb2 + " ");
        if (sb3.length() <5)
            System.out.print(sb3 + " ");
        if (sb4.length() <5)
            System.out.print(sb4 + " ");
        if (sb5.length() <5)
            System.out.print(sb5 + " ");
        if (sb6.length() <5)
            System.out.print(sb6 + " ");
        System.out.println();

        List<StringBuilder> list2 = new ArrayList<>();
        list2.add(new StringBuilder("aaa"));
        list2.add(new StringBuilder("bbb"));
        list2.add(new StringBuilder("qwerty"));
        list2.add(new StringBuilder("."));
        list2.add(new StringBuilder("abcde"));
        list2.add(new StringBuilder("ccc"));

        Object[] list2Array = {sb1,sb2,sb3, sb4,sb5,sb6};
//
//        for (int i = 0; i< list2Array.size ; i++) {
//            if ([i]list2Array.length < 5) {
//                System.out.print(list2Array[i] + " ");
//            }
        }
//
//
//
////        list2.remove(2);
////        list2.remove(4);
//        for (StringBuilder s : list2) {
//            System.out.print(s + " ");
//        }
/////
////        System.out.println();
////        System.out.println(list2.toString());




    }

