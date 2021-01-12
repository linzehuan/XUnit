package xunit;

import org.junit.jupiter.api.Test;
import xunit.fixture.SingleMethodTestCase;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
/**
 * @author Lin Zehuan
 */
public class SingleMethodTestCaseTest {

    @Test
    public void should_create_single_test_method_case(){
        SingleMethodTestCase singleMethodTestCase = new SingleMethodTestCase();
        assertThat(singleMethodTestCase.getTestMethodsCount(),is(1));
    }
}
