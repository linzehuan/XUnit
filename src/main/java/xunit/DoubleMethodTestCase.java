package xunit;

/**
 * @author Lin Zehuan
 */
public class DoubleMethodTestCase extends RTWTestCase{

    public DoubleMethodTestCase() {
        this.registerTestMethod("first_test_method",this::first_test_method);
        this.registerTestMethod("second_test_method",this::second_test_method);
    }

    public void second_test_method() {

    }

    public void first_test_method() {

    }
}
