import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * A JUnit test client for the CountNegatives class.
 *
 * @author Dean Hendrix (dh@auburn.edu)
 * @version  2017-08-22
 */
public class CountNegativesTest {

    /** Test with no negative values. */
    @Test
    public void testCountNegativeNone() {
        int[] a = {0, 2, 4, 6, 8};
        int expected = 0;
        int actual = CountNegatives.countNegatives(a);
        assertEquals(expected, actual);
    }

    /** Test with some negative values. */
    @Test
    public void testCountNegativeSome() {
        int[] a = {0, -2, 4, -6, -8};
        int expected = 3;
        int actual = CountNegatives.countNegatives(a);
        assertEquals(expected, actual);
    }

    /** Test with all negative values. */
    @Test
    public void testCountNegativeAll() {
        int[] a = {-1, -2, -3, -4, -5};
        int expected = 5;
        int actual = CountNegatives.countNegatives(a);
        assertEquals(expected, actual);
    }

}
