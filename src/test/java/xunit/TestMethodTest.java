package xunit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

/**
 * @author Lin Zehuan
 */
public class TestMethodTest {

    private MockTestMethodRun mockTestMethodRun;

    @BeforeEach
    public void init() {
        mockTestMethodRun = mock(MockTestMethodRun.class);
    }

    @Test
    public void should_create_test_method() {
        String methodName = "testMethod";
        TestMethod testMethod = TestMethod.of(methodName, () -> {
        });
        assertThat(testMethod.getName(), is(methodName));
    }

    @Test
    public void should_run_test_method() {
        TestMethod testMethod = TestMethod.of("test", this::should_test_success);
        testMethod.run();
        verify(mockTestMethodRun, times(1)).run();
    }

    public void should_test_success() {
        mockTestMethodRun.run();
    }

    @Test
    public void should_run_test_success() {
        TestMethod testMethod = TestMethod.of("test_success", this::should_test_success);
        TestResult testResult = testMethod.run();
        assertThat(testResult, is(TestResult.ofSuccess()));
    }

    public void should_test_fail() {
        assertThat("success", is("failed"));
    }

    @Test
    public void should_run_test_failed() {
        TestMethod testMethod = TestMethod.of("test_failed", this::should_test_fail);
        TestResult testResult = testMethod.run();
        assertThat(testResult, is(TestResult.ofFailed("\nExpected: is \"failed\"\n     but: was \"success\"")));
    }
}

