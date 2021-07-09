import java.util.ArrayList;

public class MainDriver {
    public static void main(String[] args) {
        Subject Precalculus = new Subject("Precalculus", 5);
        Subject Calculus = new Subject("Calculus", 4);
        Subject History = new Subject("Precalculus", 4);

        ArrayList<Subject> subjects = new ArrayList<>();
        subjects.add(Precalculus);
        subjects.add(Calculus);
        subjects.add(History);

        Semester summer = new Semester("Summer",subjects);
        Semester fall = new Semester("Summer",subjects);
        Student jack = new Student("Jack", "Bower", summer);

        System.out.println(jack);
    }
}
