package Array3;

/**
 * Given two arrays of ints sorted in increasing order, outer and inner,
 * return true if all of the numbers in inner appear in outer.
 * The best solution makes only a single "linear" pass of both arrays,
 * taking advantage of the fact that both arrays are already in sorted order.
 */
public class LinearIn {

    public boolean linearIn(int[] outer, int[] inner) {
        boolean isIn;
        for (int anInner : inner) {
            isIn = false;
            for (int anOuter : outer) {
                if (anInner == anOuter) {
                    isIn = true;
                    break;
                }
            }
            if (!isIn) return false;
        }
        return true;
    }
}
