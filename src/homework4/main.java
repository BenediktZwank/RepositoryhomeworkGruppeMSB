package homework4;

import code.Course;

public class main {
    public static void main(String[] args) {


        // Subjekt erstellen
        CourseDistributor distributor = new CourseDistributor();

        Course mathCourse = new Course(101, "Maths");

        // Beobachter erstellen
        User student1 = new User("Alex", 1,mathCourse );
        User student2 = new User("Enay", 2, mathCourse );

        // Beobachter registrieren
        distributor.addObserver(student1);
        distributor.addObserver(student2);

distributor.notifyObservers("Die Kursverteilung hat sich geändert, Student 1 und 2 wurden hinzugefügt");


    }


    }



