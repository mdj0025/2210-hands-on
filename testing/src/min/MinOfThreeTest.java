import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * MinOfThreeTest.java
 * Provides JUnit test cases for MinOfThree.min1.
 *
 * @author Dean Hendrix (dh@auburn.edu)
 * @version 2016-08-22
 *
 */
public class MinOfThreeTest {

   @Test // 000
   public void testMin1a() {
      int actual = MinOfThree.min1(2, 2, 2);
      int expected = 2;
      assertEquals(expected, actual);
   }

   @Test // 000
   public void testMin1b() {
      int actual = MinOfThree.min1(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
      int expected = Integer.MIN_VALUE;
      assertEquals(expected, actual);
   }

}
