package tasksWork.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;


public class JournalStorageService {

    public void readJournalStorage(JournalStorage journalStorage) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(journalStorage.getFilePath()));
        String line = bufferedReader.readLine();
        while (line != null && bufferedReader.ready()) {

            Subject subject = new Subject(line.replaceFirst("[*]", ""));
            Map<Pupil, List<Integer>> journal = new HashMap<>();
            line = bufferedReader.readLine();
            while (line != null && line.charAt(0) != '*') {

                String[] splitted = line.split(" ");
                Pupil pl = new Pupil(splitted[0]);
                List<Integer> value = Arrays.stream(splitted).skip(1).map(Integer::parseInt).collect(Collectors.toList());
                journal.put(pl, value);
                line = bufferedReader.readLine();

            }


            subject.setJournal(journal);
            journalStorage.getJournalStorage().add(subject);
        }

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


    }
}
