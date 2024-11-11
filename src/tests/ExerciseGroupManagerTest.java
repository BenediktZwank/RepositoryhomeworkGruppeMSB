package tests;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExerciseGroupManagerTest {

    ExerciseGroupManagerTest exerciseGroupManagerTest = new ExerciseGroupManagerTest();

    @Test
    public void testTotalStudents0() {
    assertEquals(0, exerciseGroupManagerTest.totalStudents());
  }

    @Test
    public void testTotalStudents1() {
        exerciseGroupManagerTest.addStudent("John");
        assertEquals(1, exerciseGroupManagerTest.totalStudents());
    }

}
