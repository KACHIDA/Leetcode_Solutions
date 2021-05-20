package problems;

public class SingleNumberII {

    public static void main(String[] args)
    {
            int[] A={12, 1, 12, 3, 12, 1, 1, 2, 3, 2, 2, 3, 7};
           System.out.println( singleNumber(A));
    }

    public static int singleNumber(final int[] A) {

        int result=0;
        int sum,x;

        for(int i=0;i<32;i++)
        {

            sum=0;
            x = (1<<i);

            for(int j=0;j<A.length;j++)
            {
                if((A[j] & x) != 0 )
                    sum++;
            }

            if((sum%3) !=0)
                result |= x;

        }

        return result;



    }
}
