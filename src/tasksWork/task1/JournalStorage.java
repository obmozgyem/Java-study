package tasksWork.task1;

import java.util.ArrayList;
import java.util.List;

public class JournalStorage {
    private List <Subject> journalStorage = new ArrayList<>();
    private String filePath;

    public String getFilePath() {
        return filePath;
    }

    public JournalStorage(String filePath) {
        this.filePath = filePath;
    }

    public List<Subject> getJournalStorage() {
        return journalStorage;
    }

}
