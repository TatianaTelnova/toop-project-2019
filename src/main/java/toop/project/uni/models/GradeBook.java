package toop.project.uni.models;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class GradeBook {
    private Map<Integer,Map<Subject, Mark>> book;
    public GradeBook() {
        book = new TreeMap<>();
    }

    void addSemester(int number, Set<Subject> subjects) {
        Map<Subject, Mark> semester = new TreeMap<>();
        for (Subject s : subjects) {
            semester.put(s, new Mark());
        }
        this.book.put(number, semester);
    }
}