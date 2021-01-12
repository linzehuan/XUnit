package xunit;

import java.util.Objects;

/**
 * @author Lin Zehuan
 */
public class TestMethod {
    private String name;
    private Runnable method;
    private boolean resultTmp = false;
    private TestResultEnum result = TestResultEnum.EMPTY;


    public TestMethod(String name, Runnable method) {
        this.name = name;
        this.method = method;
    }

    public static TestMethod of(String name, Runnable method) {
        return new TestMethod(name, method);
    }

    public String getName() {
        return this.name;
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

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public void run() {
        method.run();
        this.result = TestResultEnum.SUCCESS;
    }


    public TestResultEnum getResult() {
        return this.result;
    }


}
