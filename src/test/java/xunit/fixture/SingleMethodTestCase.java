package xunit.fixture;

import xunit.RTWTestCase;

/**
 * @author Lin Zehuan
 */
public class SingleMethodTestCase extends RTWTestCase {

    public SingleMethodTestCase() {
        this.registerTestMethod("single_test_method", this::single_test_method);

    }

    public void single_test_method() {

    }
}
