import java.util.concurrent.atomic.AtomicInteger;

public class Subject {
    private static AtomicInteger numGenerator = new AtomicInteger(150);
    private String id;
    private String subjectName;
    private int creditHours;

    public Subject(String subjectName, int creditHours) {
        this.subjectName = subjectName;
        this.creditHours = creditHours;
        id = courseIdGenerator(subjectName);
    }
    private String courseIdGenerator(String subjectName) {
        return subjectName.substring(0,4) + "-" + numGenerator.getAndIncrement();
    }
    @Override
    public String toString() {
        return "Course ID: " + id + ", Subject: " + subjectName + ", Credit Hour: " + creditHours;
    }

}
