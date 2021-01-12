package xunit;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * @author Lin Zehuan
 */
public class DoubleMethodTestCaseTest {


    @Test
    public void should_create_double_test_method_test_case() {
        DoubleMethodTestCase doubleMethodTestCase = new DoubleMethodTestCase();
        assertThat(doubleMethodTestCase.getTestMethodsCount(), is(2));
    }
}
