package Array2;

/**
 * Given start and end numbers, return a new array containing the sequence of integers from start up to but not including end,
 * so start=5 and end=10 yields {5, 6, 7, 8, 9}. The end number will be greater or equal to the start number.
 * Note that a length-0 array is valid. (See also: FizzBuzz Code)
 */
public class FizzArray3 {
    public int[] fizzArray3(int start, int end) {
        int n = end - start;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = start++;
        }
        return arr;
    }
}
