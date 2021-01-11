import java.util.function.Supplier;

/**
 * @author Lin Zehuan
 */
public class TestMethod {
    
    private String methodName;
    private Runnable method;

    public TestMethod(String methodName, Runnable method) {
        this.methodName = methodName;
        this.method = method;
    }

    public static TestMethod of(String methodName, Runnable method) {
        return new TestMethod(methodName,method);
    }

    public String getMethodName() {
        return methodName;
    }
}
