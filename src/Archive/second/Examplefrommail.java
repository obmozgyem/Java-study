package Archive.second;
/*
        1. Создать массив целых чисел, записать в него 10 значений. Посчитать и вывести сумму всех значений и среднее значение.
        1*. Посчитать и вывести медиану.
         */

public class Examplefrommail {
    public static void main(String[] args) {
        int[] someArray = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20}; // есть стандартное средство погуглить
//              int sum = 0;
//       for (int i : someArray)
//            sum += i;
//        System.out.println(sum);
//        int sum1 = 0;
//        for (int i = 0; i < someArray.length; i++)
//            sum1 +=someArray [i]; // все равно не понятно немного, и как кинуть массив в public
//        System.out.println(sum1);
        int arrayfull = arrayfull(someArray);
        System.out.println(arrayfull);
        System.out.println(arrayfull / someArray.length);

    }

    public static int arrayfull(int[] someArray) {
        int result = 0;
        for (int i = 0; i < someArray.length; i++) {
            result += someArray[i];

        }
        return result;
    }
}

