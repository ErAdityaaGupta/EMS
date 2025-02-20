import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoTests {

    @Test
    void testPassMessage() {
        System.out.println("Test 1: This test always passes.");
        assertTrue(true);
    }

    // @Test
    // void testFailMessage() {
    //     System.out.println("Test 2: This test always fails.");
    //     assertTrue(false);  // This will fail the test
    // }

    @Test
    void testStringComparison() {
        String expected = "Hello, EMS!";
        String actual = "Hello, EMS!";
        System.out.println("Test 3: Checking string comparison.");
        assertEquals(expected, actual, "Strings should match");
    }

    @Test
    void testNumberComparison() {
        int expected = 100;
        int actual = 100;
        System.out.println("Test 4: Checking number comparison.");
        assertEquals(expected, actual, "Numbers should match");
    }

    @Test
    void testBooleanCondition() {
        boolean condition = (5 + 5 == 10);
        System.out.println("Test 5: Checking boolean condition.");
        assertTrue(condition, "Condition should be true");
    }
}
