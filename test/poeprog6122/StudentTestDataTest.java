
package poeprog6122;

import org.junit.Test;
import static org.junit.Assert.*;
import static poeprog6122.Student.studentID;


public class StudentTestDataTest {
    
    public StudentTestDataTest() {
    }

    @Test
    public void testLoadTestData() {
    }

    @Test
    public void testSaveStudent() {
        assertEquals("Student has been successfully captured",StudentTestData.SaveStudent("J.Bloggs", "disd", "jbloggs@ymail.com", "10111", 19));
    }
    @Test
    public void teststudentAgeInvalidCharacter(){
    assertEquals("You have entered the incorrect age",StudentTestData.studentAgeInvalidCharacter());
    }
    @Test
    public void teststudentAgeValid(){
    assertEquals(17,StudentTestData.studentAgeValid());
    }
    @Test
    public void teststudentAgeInvalid(){
    assertEquals(14,StudentTestData.studentAgeInvalid());
    }
    @Test
    public void testDeleteStudent(){ 
    studentID = "10111"; 
    assertEquals("Student ID : " + studentID + " has been successfully deleted ",StudentTestData.DeleteStudent());
            }
    @Test 
    public void testSearchstudentNotFound(){
    studentID = "10110";
    assertEquals("\n -----------------------------"
                    + "\n Student with Student ID : " + studentID + " was NOT FOUND. ",StudentTestData.studentNotFound());
    }
    @Test
    public void testSearcheStudent(){ 
    studentID = "10111"; 
    assertEquals("Student ID : " + studentID + " has been found ",StudentTestData.SearchStudent());
            }
}
