import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Provides JUnit tests for the Student class. Each test is described by a
 * 3-digit bit string xxx, which describes the relationship between the
 * corresponding fields of the two Student objects involved in the test. A 0
 * means corresponding fields are the same and a 1 means that corresponding
 * fields are different. Permutations are tested within each test case, as
 * appropriate.
 * 
 * @author Dean Hendrix (dh@auburn.edu)
 * @version 2017-09-06
 */
public class StudentTest {

   /** Create feedback message for test. */
   private String feedback(Student one, Student two) {
      return "Incorrect return value for x.compareTo(y) where " 
         + "x = " + one + " "
         + "y = " + two;   
   }

   @Test
   public void testCompareTo000() {
      Student s1 = new Student("a", "a", 1);
      Student s2 = new Student("a", "a", 1);

      int cmp = s1.compareTo(s1);
      assertTrue(feedback(s1, s1), cmp == 0);
      
      cmp = s1.compareTo(s2);
      assertTrue(feedback(s1, s2), cmp == 0);
      
      cmp = s2.compareTo(s1);
      assertTrue(feedback(s2, s1), cmp == 0);
   }

   @Test
   public void testCompareTo001() {
      Student s1 = new Student("a", "a", 1);
      Student s2 = new Student("a", "a", 2);

      int cmp = s1.compareTo(s2);
      assertTrue(feedback(s1, s2), cmp < 0);

      cmp = s2.compareTo(s1);
      assertTrue(feedback(s2, s1), cmp > 0);
   }

   @Test
   public void testCompareTo010() {
      Student s1 = new Student("a", "a", 1);
      Student s2 = new Student("a", "b", 1);

      int cmp = s1.compareTo(s2);
      assertTrue(feedback(s1, s2), cmp < 0);

      cmp = s2.compareTo(s1);
      assertTrue(feedback(s2, s1), cmp > 0);
   }

   @Test
   public void testCompareTo011() {
      Student s1 = new Student("a", "b", 1);
      Student s2 = new Student("a", "c", 2);

      int cmp = s1.compareTo(s2);
      assertTrue(feedback(s1, s2), cmp < 0);

      cmp = s2.compareTo(s1);
      assertTrue(feedback(s2, s1), cmp > 0);

      s1 = new Student("a", "b", 2);
      s2 = new Student("a", "c", 1);
      cmp = s1.compareTo(s2);
      assertTrue(feedback(s1, s2), cmp < 0);

      cmp = s2.compareTo(s1);
      assertTrue(feedback(s2, s1), cmp > 0);
   }

   @Test
   public void testCompareTo100() {
      Student s1 = new Student("a", "c", 1);
      Student s2 = new Student("b", "c", 1);

      int cmp = s1.compareTo(s2);
      assertTrue(feedback(s1, s2), cmp < 0);

      cmp = s2.compareTo(s1);
      assertTrue(feedback(s2, s1), cmp > 0);
   }

   @Test
   public void testCompareTo101() {
      Student s1 = new Student("a", "c", 1);
      Student s2 = new Student("b", "c", 2);

      int cmp = s1.compareTo(s2);
      assertTrue(feedback(s1, s2), cmp < 0);

      cmp = s2.compareTo(s1);
      assertTrue(feedback(s2, s1), cmp > 0);

      s1 = new Student("a", "c", 2);
      s2 = new Student("b", "c", 1);
      cmp = s1.compareTo(s2);
      assertTrue(feedback(s1, s2), cmp < 0);

      cmp = s2.compareTo(s1);
      assertTrue(feedback(s2, s1), cmp > 0);
   }

   @Test
   public void testCompareTo110() {
      Student s1 = new Student("a", "c", 1);
      Student s2 = new Student("b", "d", 1);

      int cmp = s1.compareTo(s2);
      assertTrue(feedback(s1, s2), cmp < 0);

      cmp = s2.compareTo(s1);
      assertTrue(feedback(s2, s1), cmp > 0);

      s1 = new Student("a", "d", 1);
      s2 = new Student("b", "c", 1);
      cmp = s1.compareTo(s2);
      assertTrue(feedback(s1, s2), cmp < 0);

      cmp = s2.compareTo(s1);
      assertTrue(feedback(s2, s1), cmp > 0);
   }


   @Test
   public void testCompareTo111() {
      Student s1 = new Student("a", "c", 1);
      Student s2 = new Student("b", "d", 2);

      int cmp = s1.compareTo(s2);
      assertTrue(feedback(s1, s2), cmp < 0);

      cmp = s2.compareTo(s1);
      assertTrue(feedback(s2, s1), cmp > 0);

      s1 = new Student("a", "d", 1);
      s2 = new Student("b", "c", 2);
      cmp = s1.compareTo(s2);
      assertTrue(feedback(s1, s2), cmp < 0);

      cmp = s2.compareTo(s1);
      assertTrue(feedback(s2, s1), cmp > 0);

      s1 = new Student("a", "d", 2);
      s2 = new Student("b", "c", 1);
      cmp = s1.compareTo(s2);
      assertTrue(feedback(s1, s2), cmp < 0);

      cmp = s2.compareTo(s1);
      assertTrue(feedback(s2, s1), cmp > 0);

      s1 = new Student("a", "c", 2);
      s2 = new Student("b", "d", 1);
      cmp = s1.compareTo(s2);
      assertTrue(feedback(s1, s2), cmp < 0);

      cmp = s2.compareTo(s1);
      assertTrue(feedback(s2, s1), cmp > 0);
   }

}
