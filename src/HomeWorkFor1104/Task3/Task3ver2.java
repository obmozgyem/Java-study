package HomeWorkFor1104.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3ver2 {
    public static void main(String[] args) {

        try (BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in))) {
            String inputString = rdr.readLine();

            while (!inputString.equals("end")) {
                try {
                    String s1 = inputString.replaceAll("\\s", "");  // "2+1"
                    String sign = s1.replaceAll("\\d", "");         // "+"
                    String[] numbers = s1.split("[" + sign + "]");            // ["2","1"]
                    System.out.println(getResult(numbers, sign));
                } catch (RuntimeException e) {
                    System.err.println("Invalid input. Type expression again:");
                }
                inputString = rdr.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("FINISH");
    }

    private static double getResult(String[] numbers, String sign) {

        double result;
        int n1 = Integer.parseInt(numbers[0]);
        int n2 = Integer.parseInt(numbers[1]);

        result = switch (sign) {
            case "+" -> n1 + n2;
            case "-" -> n1 - n2;
            case "*" -> n1 * n2;
            case "/" -> (double) n1 / n2;
            default -> throw new RuntimeException();
        };

        return result;
    }

}
