package xunit;

import java.util.Objects;

/**
 * @author Lin Zehuan
 */
public class TestResult {
    public TestResultEnum result = TestResultEnum.EMPTY;

    public String failedMessage = "";

    public TestResult(TestResultEnum result) {
        this.result = result;
    }

    public TestResult(TestResultEnum testResult, String failedMessage) {
        this.result = testResult;
        this.failedMessage = failedMessage;
    }

    public static TestResult ofSuccess() {
        return new TestResult(TestResultEnum.SUCCESS);
    }

    public static TestResult ofFailed(String failedMessage) {
        return new TestResult(TestResultEnum.FAILED, failedMessage);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TestResult)) return false;
        TestResult that = (TestResult) o;
        return result == that.result && Objects.equals(failedMessage, that.failedMessage);
    }

}
