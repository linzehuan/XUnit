package xunit;

import org.junit.jupiter.api.Test;
import xunit.fixture.RegisterMethodTestCase;
import xunit.fixture.RunAllTestCase;

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

    @Test
    public void should_run_all_register_test(){
        RunAllTestCase runAllTestCase = new RunAllTestCase();
        List<TestMethod> expectedTetMethodList = runAllTestCase.getTestMethods();
        assertThat(expectedTetMethodList, is(runAllTestCase.expectedTestMethods()));
        runAllTestCase.run();
        assertThat(expectedTetMethodList.get(0).getName(), is(RunAllTestCase.SHOULD_TEST_SUCCESS_METHOD_NAME));
        assertThat(expectedTetMethodList.get(0).getResult(), is(TestResultEnum.SUCCESS));

        assertThat(expectedTetMethodList.get(1).getName(), is(RunAllTestCase.SHOULD_TEST_FAILED_METHOD_NAME));
        assertThat(expectedTetMethodList.get(1).getTestResult().result, is(TestResultEnum.FAILED));
        assertThat(expectedTetMethodList.get(1).getTestResult().failedMessage, is("\nExpected: is <2>\n     but: was <1>"));

        assertThat(expectedTetMethodList.get(2).getName(), is(RunAllTestCase.SHOULD_TEST_SUCCESS_TOO_METHOD_NAME));
        assertThat(expectedTetMethodList.get(2).getResult(), is(TestResultEnum.SUCCESS));


    }


}
