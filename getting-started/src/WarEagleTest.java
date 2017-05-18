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
    * Tests the cheer1() method.
    */
   @Test
   public void testCheer1() {
      String expected = "War Eagle!";
      String actual = WarEagle.cheer1();
      Assert.assertEquals("", expected, actual);
   }

   /**
    * Tests the cheer2() method.
    */
   @Test
   public void testCheer2() {
      String expected = "Bodda getta, bodda getta, bodda getta, bah!";
      String actual = WarEagle.cheer2();
      Assert.assertEquals("", expected, actual);
   }

}
