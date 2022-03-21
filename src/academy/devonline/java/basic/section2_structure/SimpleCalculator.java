package academy.devonline.java.basic.section2_structure;

/*
Реализовать программу SimpleCalculator, которая запрашивает с консоли переменные a и b и
выводит результат всех арифметических операций в формате: операнд1 операция операнд2 равно результат.

 */

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.println("Please enter a");
        int a =6; //new Scanner(System.in).nextInt();
        System.out.println("Please enter b");
        int b =3; //new Scanner(System.in).nextInt();
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }
}
