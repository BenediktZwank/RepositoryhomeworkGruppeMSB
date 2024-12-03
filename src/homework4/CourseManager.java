package homework4;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {

    private ArrayList<String> courses;

    public CourseManager() {

        this.courses = new ArrayList<>();
    }

    /**
     * Adds a course to the list. It should only do so
     * if courseName is not null and the course is not
     * already in the list.
     *
     * @param courseName The name of the course to add.
     */
    public final void addCourse(String courseName) {
        courses.add(courseName);
    }

    /**
     * Removes a course from the list. It should only do so
     * if courseName is not null and the course is in the list.
     *
     * @param courseName The name of the course to remove.
     */
    public final boolean removeCourse(String courseName) {
        return courses.remove(courseName);
    }
}