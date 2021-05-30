import java.util.Arrays;

public class MinimumDifferencePuzzle {

    public static void main(String[] args)
    {
            int[] A={759, 106, 827, 279, 722, 954, 80, 577, 273, 538, 963, 296, 693, 694, 684, 406, 603, 192, 166, 233, 310, 969, 980, 36, 322, 409, 392, 824, 422, 729, 76, 532, 186, 902, 811, 907, 855};
            System.out.println(solve(A,16));

    }

    public static int solve(int[] A,int B)
    {
        Arrays.sort(A);
        int ans=1000000;
        for(int i=0;i<=(A.length-B);i++)
        {
            ans = Math.min(ans, A[i+B-1] - A[i]  );
        }
        return ans;
    }
    
}
