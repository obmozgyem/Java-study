package HomeWork1503.Task6;

/*Создать множество целых чисел (HashSet<Integer>).
Записать в него 10 случайных чисел. Создать переменную int border и присвоить ей случайное значение.
Удалить из множества все числа, меньше чем border, и вывести содержимое множества на консоль.
 */


import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Task6 {
    private static final int NUMBER_BORDER = 100;

    public static void main(String[] args) {
        Set<Integer> intSet = new HashSet<>();
        Random random = new Random();
        while (intSet.size() < 10) {
            intSet.add(random.nextInt(NUMBER_BORDER));
        }
        System.out.println(intSet);

        int border = random.nextInt(NUMBER_BORDER);
        System.out.println(border);

        Iterator<Integer> iterator = intSet.iterator();
        while (iterator.hasNext()) {
            Integer el = iterator.next();
            if (el < border) {
                iterator.remove();
            }
        }


        System.out.println(intSet);
    }
}
