package tasksWork.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Задача:
Есть ученики и предметы. Ученику можно выставить оценку по предмету.
Данные об оценках можно считать из файла и записать в файл.
*MATH
Ivanov 5 2 5 3
Petrov 3 5
*GEOGRAPHY
Ivanov 2
Sidorov 5 5 5
 */

//              Math Ivanov 5
public class Task1 {
    private static final String MENU_STRING = "\n1. Read from file\n2. Write to file\n3. Enter mark\nEnter end\n";

    public static void main(String[] args) {

        JournalStorageService journalStorageService = new JournalStorageService();
        JournalStorage journalStorage = new JournalStorage("resources/journal1");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(MENU_STRING);
            String inputString = br.readLine();
            while (!inputString.equals("end")) {

                switch (inputString) {
                    case "1" -> journalStorageService.readJournalStorage(journalStorage);
//                    case "1":
//                        System.out.println("1");
//                        break;
                    case "2" -> System.out.println("2");
                    case "3" -> System.out.println("3");
                    default -> System.err.println("Try again");
                }
                System.out.println(MENU_STRING);
                inputString = br.readLine();


            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("FINISH");
    }
}
