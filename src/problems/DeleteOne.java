/*
* Given an integer array A of size N. You have to delete one element such that the GCD(Greatest common divisor) of the remaining array is maximum.

Find the maximum value of GCD.
*
 A = [12, 15, 18]
 If you delete 12, gcd will be 3.
 If you delete 15, gcd will be 6.
 If you delete 18, gcd will 3.
 Maximum vallue of gcd is 6.
* */


package problems;

public class DeleteOne {

    public static void main(String[] args)
    {
        int[] A={12, 15, 18};
        System.out.println(solve(A));
    }
    public static int solve(int[] A) {
        int result=0,maxGCD=-999999999;
        result=A[0];
        int pointer =0;
        while(pointer < A.length)
        {
            result=0;
            for(int i=0;i<A.length ;i++)
            {
                if(pointer !=i)
                {
                    result=gcd(result,A[i]);
                }
            }
            maxGCD=Math.max(result,maxGCD);
            pointer++;
        }

        return maxGCD;
    }

    public static int gcd(int a,int b)
    {
        if(a == 0)
            return b;
        else
            return gcd(b%a,a);
    }
}
