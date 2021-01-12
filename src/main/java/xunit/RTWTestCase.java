package xunit;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lin Zehuan
 */
public class RTWTestCase {

    private List<TestMethod> testMethods = new ArrayList<>();

    public RTWTestCase() {
        if (this instanceof SingleMethodTestCase) {
            this.testMethods.add(new TestMethod());
        }
        if (this instanceof DoubleMethodTestCase) {
            this.testMethods.add(new TestMethod());
            this.testMethods.add(new TestMethod());
        }
    }
    public int getTestMethodsCount() {
        return testMethods.size();
    }
}
