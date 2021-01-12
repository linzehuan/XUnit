package xunit;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

/**
 * @author Lin Zehuan
 */
public class TestMethodTest {

    private MockTestMethodRun mockTestMethodRun;

    @Test
    public void should_create_test_method(){
        String methodName = "testMethod";
        TestMethod testMethod = TestMethod.of(methodName,()->{});
        assertThat(testMethod.getName(), is(methodName));
   }

   @Test
   public void should_run_test_method(){
       mockTestMethodRun = mock(MockTestMethodRun.class);
       TestMethod testMethod = TestMethod.of("test",this::should_run_method);
       testMethod.run();
       verify(mockTestMethodRun,times(1)).run();
   }

    public void should_run_method() {
        mockTestMethodRun.run();
    }
}
