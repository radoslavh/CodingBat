package Array3;

/**
 * Given n>=0, create an array length n*n with the following pattern,
 * shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1}
 * (spaces added to show the 3 groups).
 */
public class SquareUp {
    public int[] squareUp(int n) {
        int[] arr = new int[n*n];
        if(n==0) return arr;
        int tmp = n;
        for(int i=arr.length; i>=0; i-=n) {
            for(int j=1; j<=tmp; j++){
                arr[i-j]=j;
            }
            tmp--;
        }
        return arr;
    }
}
