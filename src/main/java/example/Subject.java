package example;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final String name;
    private List<Integer> notes;
    private final int maxNote = 6;

    public Subject(String name) {
        this.name = name;
        this.notes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Integer> getNotes() {
        return notes;
    }

    public void addANote(int note) {

        if (note < 1 || note > maxNote) {
            throw new IllegalArgumentException();
        }
        this.notes.add(note);
    }

    public double averageNote() {
        int sumOfNotes = this.notes.stream().reduce(0, Integer::sum);
        int countOfNOtes = this.notes.size();
        if (countOfNOtes == 0) {
            throw new ArithmeticException();
        }
        return sumOfNotes / countOfNOtes;
    }
}
