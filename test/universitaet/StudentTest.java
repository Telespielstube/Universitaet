/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitaet;
import java.io.IOException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author marta
 */
public class StudentTest {
    
    public StudentTest() {
    }
    
    private static Student testStudent;
    
    @BeforeClass
    public static void setUpClass() {
        testStudent = new Student("Bell\t", "Peter\t", 5, 9, 1989, 12345, "Seminar1", new Subject(2, "Programming", "Computer Science"), new Subject(2, "Mathematics", "Computer Science"), new Subject(2, "Operating Systems", "Computer Science"), new Subject(2, "Network", " Computer Science"));
        System.out.println("Starting unit test.");
    }
    
    @Test
    public void testFamilyName() throws IOException {
        String testFamilyName = testStudent.getFamilyName();
        System.out.println(testFamilyName);
    }
    
    @Test
    public void testFirstName() throws IOException {
        String testFirstName = testStudent.getFirstName();
        System.out.println(testFirstName);
    }
    
    @Test
    public void testDay() throws IOException {
        int testDay = testStudent.getDay();
        System.out.println(testDay);
    }
    
    @Test
    public void testMonth() throws IOException {
        int testMonth = testStudent.getMonth();
        System.out.println(testMonth);
    }
    
    @Test
    public void testYear() throws IOException {
        int testYear = testStudent.getYear();
        System.out.println(testYear);
    }
    @Test
    public void testMatriculationNumber() throws IOException {
        int testMatriculationNumber = testStudent.getMatriculationNumber();
        System.out.println(testMatriculationNumber);
    }
    
    @Test
    public void testSeminarGroup() throws IOException {
        String testSeminarGroup = testStudent.getSeminarGroup();
        System.out.println(testSeminarGroup);
    }
    
    @Test
    public void testFirstSubject() throws IOException {
        String testFirstSubject = testStudent.getFirstSubject().toString();
        System.out.println(testFirstSubject);
    }
  
      @Test
    public void testSecondSubject() throws IOException {
        String testFirstSubject = testStudent.getFirstSubject().toString();
        System.out.println(testFirstSubject);
    }
    
      @Test
    public void testThirdSubject() throws IOException {
        String testFirstSubject = testStudent.getFirstSubject().toString();
        System.out.println(testFirstSubject);
    }
    
      @Test
    public void testFourthSubject() throws IOException {
        String testFirstSubject = testStudent.getFirstSubject().toString();
        System.out.println(testFirstSubject);
    }
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Unit test ended.");
    }
 
}
