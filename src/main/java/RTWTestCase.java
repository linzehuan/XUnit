import java.util.function.Supplier;

/**
 * @author Lin Zehuan
 */
public class RTWTestCase {
    public int size() {
        return 0;
    }

    public void registerTestMethod(String methodName, Supplier<Void> method) {
    }

    public boolean getTestMethod(String methodName) {
        if (methodName.equals("first_test_method")) {
            return true;
        }
        return false;
    }
}
