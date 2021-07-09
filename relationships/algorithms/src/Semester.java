import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Semester {
    private static AtomicInteger numGenerator = new AtomicInteger(1000);
    private int id;
    private String semesterName;
    private ArrayList<Subject> subjects;

    public Semester(String semesterName, ArrayList<Subject> subjects) {
        this.semesterName = semesterName;
        this.subjects = new ArrayList<>(subjects);
    }

    public String toString() {
        return semesterName + " " + subjects.toString();
    }
}
