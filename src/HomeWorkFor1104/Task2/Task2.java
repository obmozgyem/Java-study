package HomeWorkFor1104.Task2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * принять с консоли целое число. Это число будет являться количеством следующих строк,  которые нужно считать с консоли.
 * Каждая строка должна содержать название товара, цену за штуку (вещественное число), количество штук, разделенные пробелом.
 * После ввода последнего товара вывести на консоль общую стоимость всех введенных товаров.
 */
public class Task2 {
    public static void main(String[] args) {


        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

            int counter = Integer.parseInt(bufferedReader.readLine());
            double sum = 0;
            for (int i = 0; i < counter; i++) {
                String[] line = bufferedReader.readLine().split(" ");
                sum += Double.parseDouble(line[1]) * Integer.parseInt(line[2]);


            }
            System.out.println(sum);

        } catch (IOException e) {
            e.printStackTrace();

        }
    }


}

