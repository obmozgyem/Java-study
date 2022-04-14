package HomeWork.For1104.Task1;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "Task1.txt");

        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNext()) {
                String number = scanner.nextLine();
                int result = 0;
                result = Integer.parseInt(number.trim());
                int resultEND = (int) Math.pow(result, 3);
                System.out.println(resultEND);

                if (number == null) {
                    scanner.close();
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
