package xunit;

/**
 * @author Lin Zehuan
 */
public class TestMethod {
    private String name;
    private Runnable method;


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
}
