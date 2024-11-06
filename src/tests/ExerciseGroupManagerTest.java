package tests;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExerciseGroupManagerTest {

    ExerciseGroupManagerTest exerciseGroupManagerTest = new ExerciseGroupManagerTest();

    //public int checkGroupCapacities(int totalStudents , int groupSize, int availableGroups );
    // Angenommen gibt Anzahl an übrig gebliebenen Studente an, also Studenten ohne Übungsgruppe


    @Test //Test ob das grundsätzliche Prinzip funktioniert
    public void TestFunction() {

        assertEquals(0, exerciseGroupManagerTest.checkGroupCapacaties(100, 20, 5));
        assertNotEquals(1, exerciseGroupManagerTest.checkGroupCapacaties(100, 20, 5));
    } //Es solle 0 rauskommen, da jeder Student einen Platz bekommen sollte

    @Test // Test ob es erkennt, wenn Studenten überbleiben; Überbelastung
    public void TestOverCapacity() {

        assertEquals(20, exerciseGroupManagerTest.checkGroupCapacaties(100, 20, 4));
        assertNotEquals(0, exerciseGroupManagerTest.checkGroupCapacaties(100, 20, 4));
    } //Es sollten 20 Studenten übrig bleiben

    @Test //Test ob es erkennt, wenn Gruppen überbleiben; Unterbelastung
    public void TestNoStudents() {

        assertEquals(0, exerciseGroupManagerTest.checkGroupCapacaties(0, 20, 10));
        assertNotEquals(20, exerciseGroupManagerTest.checkGroupCapacaties(0, 20, 10));
    } //Es sollten 0 Studenten übrig bleiben

    @Test //Test ob es erkennt, wenn Parameter falsch sind
    public void TestWrongParams() {

        assertThrows(IllegalArgumentException.class, () -> {
            exerciseGroupManagerTest.checkGroupCapacaties(100, -10, 4);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            exerciseGroupManagerTest.checkGroupCapacaties(100, 10, -4);
        });
    } //Es sollten eine Exception geworfen werden, da Gruppenanzahl und/oder Gruppengröße negativ ist

    @Test //Test ob es erkennt, wenn Gruppenanzahl 0 ist, keine Gruppen verfüpbar
    public void TestNoGroupsAvailable() {

        assertEquals(100, exerciseGroupManagerTest.checkGroupCapacaties(100, 20, 0));
    } //Es sollten 100 Studenten übrig bleiben

}
