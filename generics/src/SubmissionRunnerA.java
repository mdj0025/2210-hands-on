import java.io.File;
import java.io.FileNotFoundException;

/**
 * SubmissionRunnerA.java
 * Checks submissions for a clean compile.
 *
 * @author Dean Hendrix (dh@auburn.edu)
 * @version 2017-08-29
 */
public class SubmissionRunnerA {

    /** Drives execution. */
    public static void main(String[] args) throws FileNotFoundException {
        // The grading and submission script has already invoked javac and
        // generated the errwarn.txt file then remove it if empty. Full points
        // are awarded only for no errors or warnings; thus the file must no
        // longer exist.
        String feedback = "Your submission compiled with no errors or warnings.";
        File audit = new File("errwarn.txt");
        if (audit.exists() && !audit.isDirectory()) {
            feedback = "Your submission compiled with errors or warnings. These must be resolved.";
        }
        System.out.println(feedback);

        // force exit in case test threads are still live.
        // http://stackoverflow.com/questions/11088830/using-runclasses-junit-tests-not-shutting-down-after-timing-out-if-test-class
        System.exit(0);
    }
}
