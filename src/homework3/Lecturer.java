package homework3;

import java.util.ArrayList;

public class Lecturer extends User{

    private ArrayList<Course> courses;

    public Lecturer(String userId, String firstName, String lastName, ArrayList<Course> courses) {

        super(userId, firstName, lastName);
        this.courses = courses;
    }

    public Lecturer(String userId, String firstName, String lastName) {

        super(userId, firstName, lastName);

    }

    public void manageCourses(){
        //manage Courses
    }
}
