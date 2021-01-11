import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;

/**
 * @author Lin Zehuan
 */
public class RTWTestCase {

    private Set<TestMethod> testMethods ;


    public RTWTestCase() {
        testMethods = new HashSet<>();
    }
    public int size() {
        return testMethods.size();
    }

    public void registerTestMethod(String methodName, Supplier<Void> method) {

        this.testMethods.add(TestMethod.of(methodName, method));
    }

    public boolean getTestMethod(String methodName) {
        if (methodName.equals("first_test_method")) {
            return true;
        }
        return false;
    }
}
