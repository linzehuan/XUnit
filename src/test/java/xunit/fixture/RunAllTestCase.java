package xunit.fixture;

import xunit.RTWTestCase;
import xunit.TestMethod;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @author Lin Zehuan
 */
public class RunAllTestCase extends RTWTestCase {

    public static final String SHOULD_TEST_SUCCESS_METHOD_NAME = "should_test_success";
    public static final String SHOULD_TEST_FAILED_METHOD_NAME = "should_test_failed";
    public static final String SHOULD_TEST_SUCCESS_TOO_METHOD_NAME = "should_test_success_too";

    public RunAllTestCase() {

        this.registerTestMethod(SHOULD_TEST_SUCCESS_METHOD_NAME, this::should_test_success);
        this.registerTestMethod(SHOULD_TEST_FAILED_METHOD_NAME, this::should_test_failed);
        this.registerTestMethod(SHOULD_TEST_SUCCESS_TOO_METHOD_NAME, this::should_test_success);

    }

    public void should_test_success() {
        assertThat(1, is(1));
    }

    public void should_test_failed() {
        assertThat(1, is(2));
    }

    public void should_test_success_too() {
        assertThat(2, is(2));

    }


    public List<TestMethod> expectedTestMethods() {
        List<TestMethod> expectedTestMethods = new ArrayList<>();
        expectedTestMethods.add(TestMethod.of(SHOULD_TEST_SUCCESS_METHOD_NAME, this::should_test_success));
        expectedTestMethods.add(TestMethod.of(SHOULD_TEST_FAILED_METHOD_NAME, this::should_test_failed));
        expectedTestMethods.add(TestMethod.of(SHOULD_TEST_SUCCESS_TOO_METHOD_NAME, this::should_test_success));
        return expectedTestMethods;
    }

}
