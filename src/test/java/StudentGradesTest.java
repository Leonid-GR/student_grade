import org.example.StudentGrades;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentGradesTest {

    @Test
    public void testAddGrade() {
        StudentGrades student = new StudentGrades();

        student.addGrade(12);

        assertEquals(12, student.getGrade(0));
    }
    @Test
    public void testGetGrade() {
        StudentGrades student = new StudentGrades();

        student.addGrade(10);
        student.addGrade(8);

        assertEquals(8, student.getGrade(1));
    }
    @Test
    public void testUpdateGrade() {
        StudentGrades student = new StudentGrades();

        student.addGrade(9);
        student.updateGrade(0, 12);

        assertEquals(12, student.getGrade(0));
    }
    @Test
    public void testRemoveGrade() {
        StudentGrades student = new StudentGrades();

        student.addGrade(10);
        student.addGrade(8);

        student.removeGrade(0);

        assertEquals(8, student.getGrade(0));
    }
    @Test
    public void testAverage() {
        StudentGrades student = new StudentGrades();

        student.addGrade(10);
        student.addGrade(12);
        student.addGrade(8);

        assertEquals(10.0, student.getAverage());
    }
    @Test
    public void testAverageEmptyList() {
        StudentGrades student = new StudentGrades();

        assertEquals(0.0, student.getAverage());
    }
    @Test
    public void testPrintAll() {
        StudentGrades student = new StudentGrades();

        student.addGrade(11);
        student.addGrade(9);

        assertDoesNotThrow(() -> student.printAll());
    }
}
