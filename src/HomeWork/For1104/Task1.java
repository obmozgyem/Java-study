package HomeWork.For1104;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "Task1.txt");

        try (Scanner scanner = new Scanner(path)) {
            String number = scanner.nextLine();
            while (scanner.hasNext()) {
                int result = 0;
                result = Integer.parseInt(number.trim());
               int resultEND = (int) Math.pow(result, 3);
                System.out.println(resultEND);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
