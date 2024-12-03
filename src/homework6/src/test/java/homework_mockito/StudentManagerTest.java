package homework6.src.test.java.homework_mockito;

import homework6.src.main.java.homework_mockito.Course;
import homework6.src.main.java.homework_mockito.ExerciseGroup;
import homework6.src.main.java.homework_mockito.Student;
import homework6.src.main.java.homework_mockito.StudentManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class StudentManagerTest  {


    private StudentManager studentManager;
    private List<Course> courses;

    @Mock
    private Course mockCourse;

    @Mock
    private ExerciseGroup mockGroup1;

    @Mock
    private ExerciseGroup mockGroup2;


    @BeforeEach
    public void setup() {
        courses = new ArrayList<>();
        studentManager = new StudentManager(null, courses); // Students are not used directly here
    }

    @Test
    public void testGenerateStudentDistribution_Success() {
        // Arrange
        Student student1 = new Student("Alice", "A123");
        Student student2 = new Student("Bob", "B456");

         mockGroup1 =  new ExerciseGroup("Group 1", List.of(student1));

         mockGroup2 = new ExerciseGroup("Group 2", List.of(student2));
        Course mockCourse = new Course("Software Engineering", List.of(group1, group2));

        // Act
        courses.add(course);
        Map<String, List<String>> distribution = studentManager.generateStudentDistribution("Software Engineering");

        // Assert
        assertEquals(2, distribution.size());
        assertTrue(distribution.containsKey("Group 1"));
        assertTrue(distribution.containsKey("Group 2"));
        assertEquals(List.of("Alice (A123)"), distribution.get("Group 1"));
        assertEquals(List.of("Bob (B456)"), distribution.get("Group 2"));
    }

    @Test
    public void testGenerateStudentDistribution_CourseNotFound() {
        //Arrange
        Course course = new Course("Object-Oriented Software Engineering", List.of());
        // Arrange
        courses.add(course);
        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> studentManager.generateStudentDistribution("Software Engineering"));
    }
}