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
        int[] cnt = new int[B];
        long ans=0;
        long M = 1000000007;
        for(int i=0;i<A.length;i++)
        {
            cnt[A[i]%B]++;
        }

        ans = (cnt[0] * (cnt[0]-1))/2;
        ans = ans%M;

        int i=1,j=B-1;
        while(i<=j)
        {
            if(i==j)
            {
                ans += (cnt[i] * (cnt[j]-1))/2;
                ans = ans%M;


            }else
            {
                ans+= cnt[i]*cnt[j];
                ans = ans%M;
            }

            i++;
            j--;

        }

        int ans1=(int) ans;
        return ans1;
    }
}
