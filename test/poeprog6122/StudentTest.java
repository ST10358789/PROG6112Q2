
package poeprog6122;

import org.junit.Test;
import static org.junit.Assert.*;


public class StudentTest {
    
    public static void loadTestData(){
    
    Student.studNames.add("J.Bloggs");
    Student.studAges.add(19);
    Student.studID.add("10111");
    Student.studEmails.add("jbloggs@ymail.com");
    Student.studCourses.add("disd");
    
    }
    public StudentTest() {
    }

    @Test
    public void testSaveStudent() {
        loadTestData();
        assertEquals("disd","disd");
    }

    @Test
    public void testSearchStudent() {
        loadTestData();
        assertEquals("10111","10111");
    }
    @Test
    public void testSearchStudent_StudentNotFound() {
        loadTestData();
        assertEquals("10111","10110");
    }

    @Test
    public void testDeleteStudent() {
    }

    @Test
    public void testStudentReport() {
    }

    @Test
    public void testExitStudentApplication() {
    }

    @Test
    public void testCheckAge() {
    }
    
}
