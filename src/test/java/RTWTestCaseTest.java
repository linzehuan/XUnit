import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RTWTestCaseTest {

    @Test
    public void should_new_a_rtw_test_case() {
        RTWTestCase rtwTestCase = new RTWTestCase();
        assertEquals(0, rtwTestCase.size());
    }

    @Test
    public void should_register_a_method_to_test_case() {
        RTWTestCase rtwTestCase = new RTWTestCase();
        String firstTestMethod = "first_test_method";
        rtwTestCase.registerTestMethod(firstTestMethod, () -> null);
        assertEquals(1,rtwTestCase.size());
        assertTrue(rtwTestCase.hasTestMethod(firstTestMethod));
        String secondTestMethod = "second_test_method";
        assertFalse(rtwTestCase.hasTestMethod(secondTestMethod));
        assertFalse(rtwTestCase.hasTestMethod("third_test_method"));
        rtwTestCase.registerTestMethod(secondTestMethod, () -> null);
        assertTrue(rtwTestCase.hasTestMethod(secondTestMethod));

    }
    
}
