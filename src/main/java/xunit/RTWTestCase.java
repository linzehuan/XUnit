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
    }
    public int getTestMethodsCount() {
        if (this instanceof SingleMethodTestCase) {
            return testMethods.size();
        }
        return 2;
    }
}
