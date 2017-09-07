import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Comparator;

/**
 * Provides JUnit tests for the ClassRoll class.
 *
 * @author Dean Hendrix (dh@auburn.edu)
 * @version 2017-09-06
 */
public class ClassRollTest {

   /** Create feedback message for test. */
   private String feedback(Student one, Student two) {
      return "Incorrect return value for comp.compare(x, y) where " 
         + "x = " + one + " "
         + "y = " + two;   
   }

   @Test
   public void testComparatorAlias() {
      Comparator<Student> comp = new ClassRoll.CompareStudentsBySection();
      Student s1 = new Student("a", "a", 1);
      int cmp = comp.compare(s1, s1);
      assertTrue(feedback(s1, s1), cmp == 0);    
   }

   @Test
   public void testComparatorEqualDistinct() {
      Comparator<Student> comp = new ClassRoll.CompareStudentsBySection();
      Student s1 = new Student("a", "a", 1);
      Student s2 = new Student("a", "a", 1);
      int cmp = comp.compare(s1, s2);
      assertTrue(feedback(s1, s2), cmp == 0);    

      s1 = new Student("a", "d", 1);
      s2 = new Student("c", "b", 1);
      cmp = comp.compare(s1, s2);
      assertTrue(feedback(s1, s2), cmp == 0);    
   }

   @Test
   public void testComparatorNotEqual() {
      Comparator<Student> comp = new ClassRoll.CompareStudentsBySection();
      Student s1 = new Student("a", "a", 1);
      Student s2 = new Student("a", "a", 2);
      int cmp = comp.compare(s1, s2);
      assertTrue(feedback(s1, s2), cmp < 0);
      cmp = comp.compare(s2, s1);
      assertTrue(feedback(s2, s1), cmp > 0);

      s1 = new Student("a", "b", 1);
      s2 = new Student("a", "a", 2);
      cmp = comp.compare(s1, s2);
      assertTrue(feedback(s1, s2), cmp < 0);
      cmp = comp.compare(s2, s1);
      assertTrue(feedback(s2, s1), cmp > 0);

      s1 = new Student("d", "b", 1);
      s2 = new Student("c", "a", 2);
      cmp = comp.compare(s1, s2);
      assertTrue(feedback(s1, s2), cmp < 0);
      cmp = comp.compare(s2, s1);
      assertTrue(feedback(s2, s1), cmp > 0);
   }

}
