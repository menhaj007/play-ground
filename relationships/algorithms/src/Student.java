import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Student {
    private static AtomicInteger numGenerator = new AtomicInteger(0);
    private int id;
    private String firstName;
    private String lastName;
    private Semester semester;
    private ArrayList<Semester> semesters;

    public Student(String firstName, String lastName, Semester semester) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.semester = semester;
    }

    public String toString() {
        return "First Name: " + firstName + ", Last Name: " + lastName + ", Semester: " + semester + " Semesters Taken " + semesters.toString();
    }
}
