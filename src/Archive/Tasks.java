package Archive;

/*
1. Принимаем строку.
2. Бьем на массив слов.
3. Заводим 2 переменные 1. - длина элемента с индексом 0, 2. - его номер по порядку, т.е. 1.

PROFIT!
 */


import java.util.Scanner;

class Tasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] word = sc.nextLine().split(" ");
    Integer a =    Integer.valueOf(word.length);
        System.out.println(a);


// //       List<String> list = Arrays.asList(word);
//        int x= word[0].length();
//        int number =1;
//        int min = 0;
//        for (int i = 0; i < word.length; i++) {
//         min = Math.min(number, Integer.parseInt(word[i]));
//        }
//        System.out.println(min);

//        4. Крутим цикл от 0 до меньше чем размер массива. Сравниваем длины элементов, если длина меньше - перезаписываем длину.
//                Если перезаписываем длину, то перезаписываем и номер элемента (i + 1).
//        5. После полной прокрутки печатаем конечный номер элемента.

        }


    }

