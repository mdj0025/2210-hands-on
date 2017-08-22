import org.junit.* ;
import static org.junit.Assert.* ;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


/**
 * SubmissionRunner.java
 * Provides a JUnit test runner that executes correctness tests and reports the results
 * upon submission.
 *
 * @author Dean Hendrix (dh@auburn.edu)
 * @version 2017-08-22
 */
public class SubmissionRunner {

    /** Drives execution. */
    public static void main(String[] args) {
        // run the test suite
        Result result = JUnitCore.runClasses(CountNegativesTest.class);

        // calculate stats
        int count = result.getRunCount();
        int failed = result.getFailureCount();
        int passed = count - failed;

        // provide a feedback message for students
        StringBuilder sb = new StringBuilder();
        sb.append("Tests run: " + count + ", ");
        sb.append("Tests passed: " + passed + ", ");
        sb.append("Tests failed: " + failed + ".\n");
        if (failed > 0) {
            for (Failure failure : result.getFailures()) {
                sb.append(failure.toString() + "\n");
            }
        }
        System.out.println(sb.toString());

        // force exit in case test threads are still live.
        // http://stackoverflow.com/questions/11088830/using-runclasses-junit-tests-not-shutting-down-after-timing-out-if-test-class
        System.exit(0);
    }
}
