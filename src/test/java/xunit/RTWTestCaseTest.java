package xunit;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import xunit.fixture.RegisterMethodTestCase;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * @author Lin Zehuan
 */
public class RTWTestCaseTest {

    @Test
    public void should_get_all_method_from_test_case(){
        RegisterMethodTestCase registerMethodTestCase = new RegisterMethodTestCase();
        List<TestMethod> expectedTestMethodList = new ArrayList<>();
        expectedTestMethodList.add(TestMethod.of("first_method", () -> {}));
        expectedTestMethodList.add(TestMethod.of("second_method", () -> {}));
        expectedTestMethodList.add(TestMethod.of("third_method", () -> {}));
        assertThat(registerMethodTestCase.getTestMethods(), is(expectedTestMethodList));
    }
}
