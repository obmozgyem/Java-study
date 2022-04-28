package tasksWork.task1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Subject {
    Subject() {   //make constructor without parametrise
            }

    private String title;

    private Map<Pupil, List<Integer>> journal = new HashMap<>(); // ученик и его оценки

    public Subject(String title) {
        this.title = title;
    }

    public Map<Pupil, List<Integer>> getJournal() {
        return journal;
    }

    public void setJournal(Map<Pupil, List<Integer>> journal) {
        this.journal = journal;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "title='" + title + '\'' + " " + journal.size()
                ;


    }
}
