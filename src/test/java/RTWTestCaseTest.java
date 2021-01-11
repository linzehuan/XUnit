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
        rtwTestCase.registerTestMethod("first_test_method", () -> null);
        assertTrue(rtwTestCase.getTestMethod("first_test_method"));
        assertFalse(rtwTestCase.getTestMethod("second_test_method"));
    }
}
