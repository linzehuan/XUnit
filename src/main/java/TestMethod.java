import java.util.function.Supplier;

/**
 * @author Lin Zehuan
 */
public class TestMethod {
    private String methodName;
    private Supplier<Void> method;

    public TestMethod(String methodName, Supplier<Void> method) {
        this.methodName = methodName;
        this.method = method;
    }

    public static TestMethod of(String methodName, Supplier<Void> method) {
        return new TestMethod(methodName,method);
    }
}
