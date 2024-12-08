package homework6.src.test.java.homework_mockito;

import homework6.src.main.java.homework_mockito.Course;
import homework6.src.main.java.homework_mockito.ExerciseGroup;
import homework6.src.main.java.homework_mockito.Student;
import homework6.src.main.java.homework_mockito.StudentManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StudentManagerTest {


    private StudentManager studentManager;

    @Mock
    private List<Course> mockCourses;

    @BeforeEach
    public void setup() {

        MockitoAnnotations.initMocks(this);
        studentManager = new StudentManager(null, mockCourses); // Mock external components
    }

    @Test
    public void testGenerateStudentDistribution_Success() {
        // Arrange
        String courseName = "Software Engineering";
        String groupName1 = "Group 1";
        String groupName2 = "Group 2";

        Student student1 = new Student("Alice", "A123");
        Student student2 = new Student("Bob", "B456");

        ExerciseGroup group1 = mock(ExerciseGroup.class);
        ExerciseGroup group2 = mock(ExerciseGroup.class);

        when(group1.getName()).thenReturn(groupName1);
        when(group2.getName()).thenReturn(groupName2);

        when(group1.getStudents()).thenReturn(List.of(student1));
        when(group2.getStudents()).thenReturn(List.of(student2));

        Course mockCourse = mock(Course.class);
        when(mockCourse.getId()).thenReturn(courseName);
        when(mockCourse.getExerciseGroups()).thenReturn(List.of(group1, group2));

        when(mockCourses.stream())
                .thenReturn(List.of(mockCourse).stream());

        // Act
        Map<String, List<String>> distribution = studentManager.generateStudentDistribution(courseName);

        // Assert
        assertEquals(2, distribution.size());
        assertTrue(distribution.containsKey(groupName1));
        assertTrue(distribution.containsKey(groupName2));
        assertEquals(List.of("Alice (A123)"), distribution.get(groupName1));
        assertEquals(List.of("Bob (B456)"), distribution.get(groupName2));
    }

    @Test
    public void testGenerateStudentDistribution_CourseNotFound() {
        // Arrange
        String courseName = "Software Engineering";

        Course mockCourse = mock(Course.class);
        when(mockCourse.getId()).thenReturn("Different Course");

        when(mockCourses.stream())
                .thenReturn(List.of(mockCourse).stream());

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> studentManager.generateStudentDistribution(courseName));
    }
}