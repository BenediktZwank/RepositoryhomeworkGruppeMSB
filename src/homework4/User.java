package homework4;

import code.Course;

public class User implements Observer  {
    private String name;
    private int id;

    private Course course;

    public User(String name, int id, Course course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }

    @Override
    public void update(String message) {
        System.out.println("User " + name + " (ID: " + id + ") erhielt Nachricht: " + message);
       //  course.addStudent(this);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

}