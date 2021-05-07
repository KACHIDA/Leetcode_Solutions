package problems;
import java.util.Arrays;

public class MinXORValue {

    public static void main(String[] args)
    {
      int A[] = {0, 4, 7, 9};
      System.out.println(findMinXor(A));
    }

    public static int findMinXor(int[] A) {

        Arrays.sort(A);
        int minXorValue=99999999;
        for(int i=0;i<A.length-1;i++)
        {
            int tmp=A[i]^A[i+1];
            minXorValue = Math.min(tmp, minXorValue);
        }
        return minXorValue;

    }
}
