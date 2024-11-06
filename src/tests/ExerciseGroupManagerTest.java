package tests;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExerciseGroupManagerTest {

    ExerciseGroupManagerTest exerciseGroupManagerTest = new ExerciseGroupManagerTest();

    //public int checkGroupCapacities(int totalStudents , int groupSize, int availableGroups );
    // Angenommen gibt Anzahl an übrig gebliebenen Studente an, also Studenten ohne Übungsgruppe


    @Test //Test ob das grundsätzliche Prinzip funktioniert
    public void TestFunction() {

        assertEquals(0, exerciseGroupManagerTest.checkGroupCapacaties(100, 20, 7));
    } //Es solle 0 rauskommen, da jeder Student einen Platz bekommen sollte

    @Test // Test ob es erkennt, wenn Studenten überbleiben; Überbelastung
    public void TestOverCapacity() {

        assertEquals(20, exerciseGroupManagerTest.checkGroupCapacaties(100, 20, 4));
    } //Es sollten 20 Studenten übrig bleiben

    @Test


}
