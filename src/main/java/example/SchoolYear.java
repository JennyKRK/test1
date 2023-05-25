package example;

import java.util.ArrayList;
import java.util.List;

public class SchoolYear {

    private String name;
    private List<Subject> subjects;

    public SchoolYear(String name) {
        this.subjects = new ArrayList<>();
    }

    public void addSubject(Subject subject) {
        this.subjects.add(subject);
    }

    public String getName() {
        return name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public int returnCountOfNotes() {
        int count = 0;
        for (Subject s : subjects) {
            count = +s.countOfNotes();
        }
        return count;
    }

    public double getAverageNoteFromAllSubjects() {
        int sum = 0;
        int count = 0;
        if (this.subjects.size() == 0) {
            return 0.0;
        } else {

            for (Subject s : subjects) {
                List<Integer> notes = s.getNotes();
                int sumOfNotes = notes.stream().reduce(0, Integer::sum);
                int countOfNOtes = notes.size();
                sum = +sumOfNotes;
                count = +countOfNOtes;
            }
        }
        if (count == 0) {
            return 0.0;
        } else {
            return sum / count;
        }
    }
}
