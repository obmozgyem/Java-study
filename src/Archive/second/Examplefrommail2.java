package Archive.second;
/*
Дано: «треугольный» массив, то есть двумерный массив, в котором в нулевой ячейке содержится массив с 1 ячейкой,
 в первой – с двумя, во второй – с тремя и т.д. Высота равна n. Заполнить массив таким образом,
 чтобы каждый следующий элемент был в 2 раза больше предыдущего, и вывести его на консоль. Начинать со значения intStart.
Пример для n = 3 и intStart = 5:
5
10 20
40 80 160
*доп. Заполнять не «слева-направо», а «справа-налево»:
5
20 10
120 80 40
 */

public class Examplefrommail2 {

    public static void main(String[] args) {
        if (args.length == 2) {
            int initValue = 5;
            int lineCount = 3;

            System.out.println("Init value = " + initValue);
            System.out.println("Line count = " + lineCount);

            int[][] array = new int[lineCount][];

            for (int i = 0; i < lineCount; i++) {
                int[] lineArray = new int[i + 1];
                for (int j = 0; j < lineArray.length; j++) {
                    lineArray[j] = initValue;
                    initValue = initValue * 2;
                }
                array[i] = lineArray;
            }

            System.out.println("result:");

            for (int[] ints : array) {
                for (int v : ints) {
                    System.out.print(v + " ");
                }
                System.out.println();
            }
      }
        else {
            System.out.print("Please enter arguments");
        }
    }
}
//public class Examplefrommail2 {
//    public static void main(String[] args) {
//        int[][] arr = {
//                {1},
//                {1, 1},
//                {1, 1, 1},};
//
//        for (int i = 0; i < arr.length; i++) {
//            int[] row = arr[i];
//            for (int j = 0; j < row.length; j++) {
//                System.out.print(" " + arr[i][j] + " ");
//
//            }
//
//        }
//    }
//}



