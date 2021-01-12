package xunit;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
/**
 * @author Lin Zehuan
 * @description
 */
public class SingleMethodTest {

    @Test
    public void should_create_a_test_case(){
        SingleMethodTestCase singleMethodTestCase = new SingleMethodTestCase();
        assertThat(singleMethodTestCase.getTestMethodsCount(),is(1));
    }
}
