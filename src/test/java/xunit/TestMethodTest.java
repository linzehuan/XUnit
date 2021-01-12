package xunit;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @author Lin Zehuan
 */
public class TestMethodTest {

    @Test
    public void should_create_test_method(){
        String methodName = "testMethod";
        TestMethod testMethod = TestMethod.of(methodName,()->{});
        assertThat(testMethod.getName(), is(methodName));
   }
}
