import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
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

    public void registerTestMethod(String methodName, Runnable method) {
        this.testMethods.add(TestMethod.of(methodName, method));
    }

    public boolean hasTestMethod(String methodName) {
        Optional<TestMethod> methodOptional = testMethods.stream().filter(testMethod -> testMethod.getMethodName().equals(methodName)).findFirst();
        return methodOptional.isPresent();
    }

}
