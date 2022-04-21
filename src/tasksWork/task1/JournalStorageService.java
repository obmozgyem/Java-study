package tasksWork.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class JournalStorageService {

    public void readJournalStorage(JournalStorage journal) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(journal.getFilePath()));


    }
}
