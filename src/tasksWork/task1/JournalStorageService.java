package tasksWork.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;


public class JournalStorageService {
    private static final String MENU_STRINGADDMARK = "\n1. Select subject";

    public void readJournalStorage(JournalStorage journalStorage) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(journalStorage.getFilePath()));
        String line = bufferedReader.readLine();
        while (line != null && bufferedReader.ready()) {

            Subject subject = new Subject(line.replaceFirst("[*]", ""));
            Map<Pupil, List<Integer>> journal = new HashMap<>();
            line = bufferedReader.readLine();
            while (line != null && line.charAt(0) != '*') {

                String[] splitted = line.split(" ");
                Pupil pupil = new Pupil(splitted[0]);
                List<Integer> value = Arrays.stream(splitted).skip(1).map(Integer::parseInt).collect(Collectors.toList());
                journal.put(pupil, value);
                line = bufferedReader.readLine();

            }
            subject.setJournal(journal);
            journalStorage.getJournalStorage().add(subject);
        }

    }

    public void AddMarkPupil (JournalStorage journalStorage) throws IOException {
        //изменить на чтение из листа
       journalStorage.setJournalStorage();
       Subject subject = new Subject();
       subject.getJournal();
       List<Subject> listAdd = new ArrayList<>();





        System.out.println(MENU_STRINGADDMARK);
       List<Subject> addMark= journalStorage.getJournalStorage();



//        try (BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in))) {
//            String inputString = br2.readLine();
//
//            List<Subject> addMarkList = (List<Subject>) journalStorage;
//            addMarkList.
//
//            while (!inputString.equals("close")) {
//
//                if (addMarkList != null) {
//                    for (Subject subject : addMarkList) {
//                        System.out.println(subject);
//                    }
//                }
//
//            }
//        }
    }
}
