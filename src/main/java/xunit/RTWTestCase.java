package xunit;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lin Zehuan
 */
public class RTWTestCase {

    private List<TestMethod> testMethods = new ArrayList<>();

    public RTWTestCase() {
 
    }
    public int getTestMethodsCount() {
        return testMethods.size();
    }

    protected void registerTestMethod(String methodName, Runnable method) {
        this.testMethods.add(TestMethod.of(methodName, method));
    }

    public List<TestMethod> getTestMethods() {
        return this.testMethods;
    }

    protected void run() {
        for (TestMethod testMethod : this.testMethods) {
            testMethod.run();
        }
    }
}
