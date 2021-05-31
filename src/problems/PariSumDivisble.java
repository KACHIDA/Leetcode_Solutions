package problems;

public class PariSumDivisble {

    public static void main(String[] args)
    {
        int[] A={1,2,3,4,5};
        int B=2;
        System.out.println(solve(A,B));

    }

    public static int solve(int[] A,int B)
    {
        int[] freq = new int[B];
        long ans=0;
        long M = 1000000007;
        for(int i=0;i<A.length;i++)
        {
            int rem = A[i]%B;
            ans = (ans + freq[(B-rem)%B]) %M;
            freq[rem]++;
        }

        int ans1=(int)ans;
        return ans1;
    }
}
