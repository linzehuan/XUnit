package xunit;

/**
 * @author Lin Zehuan
 */
public class RTWTestCase {

    public int getTestMethodsCount() {
        if (this instanceof SingleMethodTestCase) {
            return 1;
        }
        return 2;
    }
}
