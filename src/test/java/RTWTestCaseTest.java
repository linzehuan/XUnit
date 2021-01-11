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
        rtwTestCase.registerTestMethod(firstTestMethod, () -> {});
        assertEquals(1,rtwTestCase.size());
    }

    @Test
    public void should_has_test_method_when_register_method_to_test_case(){
        RTWTestCase rtwTestCase = new RTWTestCase();
        String firstTestMethod = "first_test_method";
        rtwTestCase.registerTestMethod(firstTestMethod, () -> {});

        assertTrue(rtwTestCase.hasTestMethod(firstTestMethod));

        String secondTestMethod = "second_test_method";
        assertFalse(rtwTestCase.hasTestMethod(secondTestMethod));

        rtwTestCase.registerTestMethod(secondTestMethod, () -> {});
        assertTrue(rtwTestCase.hasTestMethod(secondTestMethod));
    }
    
}
