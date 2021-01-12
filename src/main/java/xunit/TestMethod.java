package xunit;

import java.util.Objects;

/**
 * @author Lin Zehuan
 */
public class TestMethod {
    private String name;
    private Runnable method;


    private TestResult testResult ;

    public TestMethod(String name, Runnable method) {
        this.name = name;
        this.method = method;
    }

    public static TestMethod of(String name, Runnable method) {
        return new TestMethod(name, method);
    }

    public TestResult run() {
        try {
            method.run();
            testResult = TestResult.ofSuccess();
        } catch (AssertionError e) {
            testResult = TestResult.ofFailed(e.getMessage());
        }
        return testResult;
    }

    public String getName() {
        return this.name;
    }

    public TestResult getTestResult() {
        return testResult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TestMethod)) {
            return false;
        }
        TestMethod that = (TestMethod) o;
        return Objects.equals(name, that.name);
    }

}
