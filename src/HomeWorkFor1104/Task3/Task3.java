package HomeWorkFor1104.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * считать с консоли простое арифметическое выражение, например, 3 +11, 21-36, 18/ 5 или 3 * 123,
 * вывести на консоль результат этого выражения. Обратите внимание, что в строке могут быть пробелы(а могут и не быть).
 * Добавьте обработку неправильного ввода (через обработку исключений).
 * Добавьте циклический ввод. В решении могут помочь регулярные выражения (чтобы избавиться от лишних пробелов).
 */

public class Task3 {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String inputString = br.readLine();
            while (!inputString.equals("end")) {
                try {
                    String s1 = inputString.replaceAll("\\s", "");
                    String sign = s1.replaceAll("\\d", "");
                    String[] numbers = sign.split("[" + sign + "]");
                    System.out.println(getResult(numbers, sign));
                } catch (RuntimeException e) {
                    System.err.println("Try again");
                }
                inputString = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("FINISH");


    }

    private static double getResult(String[] numbers, String sigh) {
        double result;

        int x1 = Integer.parseInt(numbers[0]);
        int x2 = Integer.parseInt(numbers[1]);

        result = switch (sigh) {
            case "+" -> x1 + x2;
            case "*" -> x1 * x2;
            case "-" -> x1 - x2;
            case "/" -> (double) x1 / x2;
            default -> throw new RuntimeException();
        };


        return result;
    }
}

