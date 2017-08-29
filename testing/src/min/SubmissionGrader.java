import org.junit.* ;
import static org.junit.Assert.* ;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import voc.grader.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 * SubmissionGrader.java
 * Provides a JUnit test runner that uses the Vocareum API to grade student
 * assignment submissions with respect to a provided test suite.
 *
 * @author Dean Hendrix (dh@auburn.edu)
 * @version 2017-08-28
 */
public class SubmissionGrader {

    // private static final int MAX_STYLE_POINTS = 10;
    private static final int MAX_CORRECTNESS_POINTS = 100;

    /** Drives execution. */
    public static void main(String[] args) throws FileNotFoundException {

        // use the Vocareum API for grading
        Grader grader = new Grader();
        GradeInfo gradeInfo;


        //////////////////
        // STYLE POINTS //
        //////////////////

        // The grading and submission script has already invoked checksyle
        // and generated the audit.txt file. Full style points are awarded for
        // a clean audit and no points are awarded for an audit with any issues.
        // A clean audit will have nothing except a line feed character between
        // the begin audit phrase and the end audit phrase.
        // String begin = "Starting audit...";
        // String end = "Audit done.";
        // int stylePoints = 0;
        // File audit = new File("audit.txt");
        // if (audit.exists() && !audit.isDirectory()) {
        //     String contents = new Scanner(audit).useDelimiter("\\Z").next();
        //     int beginIndex = contents.indexOf(begin);
        //     int endIndex = contents.indexOf(end);
        //     stylePoints = (beginIndex + begin.length() + 1 == endIndex ? MAX_STYLE_POINTS : 0);
        // }
        // gradeInfo = new GradeInfo("coding style", stylePoints);
        // grader.addGrade(gradeInfo);


        ///////////////////////
        // CORRECTNESS TESTS //
        ///////////////////////

        // run the correctness tests
        Result result = JUnitCore.runClasses(MinOfThreeTest.class);

        // calculate stats
        int count = result.getRunCount();
        int failed = result.getFailureCount();
        int passed = count - failed;

        // provide a feedback message for students
        StringBuilder sb = new StringBuilder("\n\n** Correctness test results **\n");
        sb.append("Tests run: " + count + ", ");
        sb.append("Tests passed: " + passed + ", ");
        sb.append("Tests failed: " + failed + ".\n\n");
        if (failed > 0) {
            for (Failure failure : result.getFailures()) {
                sb.append(failure.toString() + "\n");
            }
        }

        float score = (count == 0 ? count : MAX_CORRECTNESS_POINTS * ((float)passed / count));
        gradeInfo = new GradeInfo("correctness tests", Math.round(score));
        grader.addGrade(gradeInfo);
        grader.setReportOutput(0);

        // force exit in case test threads are still live.
        // http://stackoverflow.com/questions/11088830/using-runclasses-junit-tests-not-shutting-down-after-timing-out-if-test-class
        System.exit(0);
    }
}
