//package studentgrade;
//
//import junit.framework.TestCase;
//
///* JUnit 3.8.1 */
//public class StudentGradeTest extends TestCase {
//    
//    public StudentGradeTest(String testName) {
//        super(testName);
//    }
//
//    public void testGetGrade95() {
//        System.out.println("getGrade 95");
//        int mark = 95;
//        String expResult = "A";
//        String result = StudentGrade.getGrade(mark);
//        assertEquals(expResult, result);
//    }
//
//    public void testGetGrade85() {
//        System.out.println("getGrade 85");
//        int mark = 85;
//        String expResult = "B";
//        String result = StudentGrade.getGrade(mark);
//        assertEquals(expResult, result);
//    }
//    
//    public void testGetGrade75() {
//        System.out.println("getGrade 85");
//        int mark = 75;
//        String expResult = "F";
//        String result = StudentGrade.getGrade(mark);
//        assertEquals(expResult, result);
//    }
//}
package studentgrade;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentGradeTest {
    @Test
    void testGetGrade95() {
        System.out.println("getGrade 95");
        int mark = 95;
        String expResult = "A";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }
    
    @Test
    void testGetGrade85() {
        System.out.println("getGrade 85");
        int mark = 85;
        String expResult = "B";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }
    
    @Test
    void testGetGrade75() {
        System.out.println("getGrade 75"); // Fixed typo from "85" to "75"
        int mark = 75;
        String expResult = "F";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }
}