package xunit;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lin Zehuan
 */
public class RTWTestCase {

    private List<TestMethod> testMethods = new ArrayList<>();

    public RTWTestCase() {
        if (this instanceof DoubleMethodTestCase) {
            this.testMethods.add(new TestMethod("",()->{}));
            this.testMethods.add(new TestMethod("",()->{}));
        }
    }
    public int getTestMethodsCount() {
        return testMethods.size();
    }

    protected void registerTestMethod(String methodName, Runnable method) {
        this.testMethods.add(new TestMethod(methodName, method));
    }
}
