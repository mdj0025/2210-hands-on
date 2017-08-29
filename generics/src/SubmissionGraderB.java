import voc.grader.*;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * SubmissionGraderB.java Uses the Vocareum API to grade student submissions
 * with respect to requirements.
 * 
 * @author Dean Hendrix (dh@auburn.edu)
 * @version 2017-08-29
 */
public class SubmissionGraderB {

    private static final int MAX_POINTS = 100;

    /** Drives execution. */
    public static void main(String[] args) throws FileNotFoundException {

        // use the Vocareum API for grading
        Grader grader = new Grader();
        GradeInfo gradeInfo;

        // The grading and submission script has already invoked javac and
        // generated the errwarn.txt file then remove it if empty. Full points
        // are awarded only for no errors or warnings; thus the file must no
        // longer exist.
        int points = MAX_POINTS;
        File audit = new File("errwarn.txt");
        if (audit.exists() && !audit.isDirectory()) {
            points = 0;
        }
        gradeInfo = new GradeInfo("clean compile", points);
        grader.addGrade(gradeInfo);

        // force exit in case test threads are still live.
        // http://stackoverflow.com/questions/11088830/using-runclasses-junit-tests-not-shutting-down-after-timing-out-if-test-class
        System.exit(0);
    }
}
