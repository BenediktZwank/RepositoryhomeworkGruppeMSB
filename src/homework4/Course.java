package homework4;

import java.util.ArrayList;
import java.util.List;

public class Course  {

    private int courseId;
    private String courseName;
    private List<User> students = new ArrayList<>();

public Course(int courseId, String courseName) {

    this.courseId = courseId;
    this.courseName = courseName;
}
    public void addStudent(User student) {
        students.add(student);

        System.out.println("Student " + student.getName() + " wurde zu " + courseName + " hinzugefügt.");
    }

    public String getCourseName() {
        return courseName;
    }


;}
