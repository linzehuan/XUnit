package xunit.fixture;

import xunit.RTWTestCase;

/**
 * @author Lin Zehuan
 */
public class RegisterMethodTestCase extends RTWTestCase {

    public RegisterMethodTestCase() {
        this.registerTestMethod("first_method",this::first_method);
        this.registerTestMethod("second_method",this::second_method);
        this.registerTestMethod("third_method",this::third_method);

    }

    private void second_method() {

    }

    private void third_method() {

    }

    private void first_method() {

    }
}
