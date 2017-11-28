package Array1;

/**
 * Given 2 int arrays, a and b, of any length, return a new array with the first element of each array.
 * If either array is length 0, ignore that array.
 */
public class Front11 {
    public int[] front11(int[] a, int[] b) {
        int[] ints = new int[]{};

        if (a.length > 0) {
            if (b.length > 0)
                ints = new int[]{a[0], b[0]};
            else ints = new int[]{a[0]};
        } else {
            if (b.length > 0)
                ints = new int[]{b[0]};
        }
        return ints;
    }
}
