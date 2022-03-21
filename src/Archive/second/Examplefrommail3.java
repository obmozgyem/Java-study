package Archive.second;
/*Вывести в строку через пробел все числа от 1 до 100 (включая обе границы), которые делятся без остатка на 3 и на 7
  одновременно.

                */

public class Examplefrommail3 {
           public static void main(String[] args) {
               {
                   for (int i = 1; i <= 100; i++) {
                       if (i % 3 == 0 && i % 7 == 0)
                           System.out.print(i + " ");
                   }
               }
               System.out.println();
               {
//                   *доп1. Вывести в строку через пробел все числа от 1 до 100, которые делятся без остатка либо на 5, либо на 7,
//                       но не одновременно на 5 и на 7.
//                       *доп2. Вывести числа из диапазонов [10; 19], [30; 39], [50; 59], [70; 79], [90; 99],
//                   которые делятся либо на 5, либо на 7, но не одновременно на 5 и на 7.
//                   Эта задача решается через цикл и ифы.
                   for (int i = 1; i <= 100; i++) {
                       if (i % 5 == 0 & i % 7 == 0)
                           continue;
                       if (i % 5 == 0 | i % 7 == 0)
                           System.out.print(i + " ");
                   }
               }
               System.out.println();
               {
                   for (int i = 10; i <= 19; i++) {
                       if (i % 5 == 0 & i % 7 == 0)
                           continue;
                       if (i % 5 == 0 | i % 7 == 0)
                           System.out.print(i + " ");
                   }
               }
               {
                   for (int i = 30; i <= 39; i++) {
                       if (i % 5 == 0 & i % 7 == 0)
                           continue;
                       if (i % 5 == 0 | i % 7 == 0)
                           System.out.print(i + " ");
                   }
               }
               {
                   for (int i = 50; i <= 59; i++) {
                       if (i % 5 == 0 & i % 7 == 0)
                           continue;
                       if (i % 5 == 0 | i % 7 == 0)
                           System.out.print(i + " ");
                   }
               }
               {
                   for (int i = 70; i <= 79; i++) {
                       if (i % 5 == 0 & i % 7 == 0)
                           continue;
                       if (i % 5 == 0 | i % 7 == 0)
                           System.out.print(i + " ");
                   }
               }
               {
                   for (int i = 90; i <= 99; i++) {
                       if (i % 5 == 0 & i % 7 == 0)
                           continue;
                       if (i % 5 == 0 | i % 7 == 0)
                           System.out.print(i + " ");
                   }
               }
        }
    }
    

