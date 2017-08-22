/**
 * Provides a client for the LinearSearch class.
 *
 * @author Dean Hendrix (dh@auburn.edu)
 * @version 2017-08-22
 */
public class LinearSearchClient {

    /**
     * Drives execution.
     */
    public static void main(String[] args) {
        int[] a = {2,4,6,8,10};
        System.out.println(LinearSearch.search(a, 8));
        System.out.println(LinearSearch.search(a, 0));
    }
}
