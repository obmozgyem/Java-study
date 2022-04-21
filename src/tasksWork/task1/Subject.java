package tasksWork.task1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Subject {
    private String title;

    private Map<Pupil, List<Integer>> journal= new HashMap<>();

    public Subject(String title) {
        this.title = title;
    }

    public Map<Pupil, List<Integer>> getJournal() {
        return journal;
    }

}
