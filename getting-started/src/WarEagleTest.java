import org.junit.Assert;
import org.junit.Test;

/**
 * WarEagleTest.java.
 * Tests the WarEagle class with JUnit.
 *
 * @author  Dean Hendrix (dh@auburn.edu)
 * @version 2015-08-17
 */
public class WarEagleTest {

   /**
    * Tests the cheer() method.
    */
   @Test
   public void testCheer() {
      String expected = "War Eagle!";
      String actual = WarEagle.cheer();
      Assert.assertEquals("", expected, actual);
   }

}
