package problems;

public class NthMagicNumber {

    public static void main(String[] args)
    {
        System.out.println(solve(10));
    }

    public  static int solve(int A) {


        int pow=1,ans=0,num=1;

        while(A > 0)
        {

            pow = pow*5;

            if( (A&num) == 1)
                ans+= pow;

            A>>=1;

        }

        return ans;
    }
}
