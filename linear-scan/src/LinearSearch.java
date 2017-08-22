/**
 * Illustrates a linear search solution.
 *
 * @author Dean Hendrix (dh@auburn.edu)
 * @version  2017-08-22
 */
public class LinearSearch {

    /**
     * Implements linear search on an array of integers.
     */
    public static int search(int[] a, int target) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
