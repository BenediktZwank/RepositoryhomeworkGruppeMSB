package homework3;

public class Main {
    public static void main(String[] args) {
        // Beispiel-Entitäten erstellen
        Student student1 = new Student("S1", "Alice", "Miller");
        Student student2 = new Student("S2", "Bob", "Meyer");
        Lecturer lecturer1 = new Lecturer("L1","Max" ,"Prof. Smith");

        // code.EntityManager für Studenten
        EntityManager<Student> studentManager = new EntityManager<>();
        studentManager.addEntity(student1);
        studentManager.addEntity(student2);

        // code.EntityManager für Dozenten
        EntityManager<Lecturer> lecturerManager = new EntityManager<>();
        lecturerManager.addEntity(lecturer1);

        // Beispielsuche: Suche einen Studenten mit einer bestimmten ID
        Student foundStudent = studentManager.findEntityByCriterion(student -> student.getUserId().equals("S1"));
        System.out.println("Gefundener code.Student: " + (foundStudent != null ? foundStudent.getLastName() : "nicht gefunden"));

        // Beispielsuche: Suche einen Dozenten mit einem bestimmten Namen
        Lecturer foundLecturer = lecturerManager.findEntityByCriterion(lecturer -> lecturer.getLastName().equals("Prof. Smith"));
        System.out.println("Gefundener Dozent: " + (foundLecturer != null ? foundLecturer.getLastName() : "nicht gefunden"));

        //Push um Workflow auszulösen
    }
}
