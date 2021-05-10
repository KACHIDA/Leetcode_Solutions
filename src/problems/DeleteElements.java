package problems;

public class DeleteElements {

    public static void main(String[] args)
    {
        int[] A={15, 30};
        System.out.println(solve(A));
    }

    public static int gcd(int a,int b)
    {
        if(a==0)
            return b;
        return gcd(b%a,a);
    }

    public static int solve(int[] A) {

            int result=A[0];
            int count=0;
            for(int i=1;i<A.length;i++)
            {
                result=gcd(A[i],result);
                    if(result ==1 )
                    {
                        return 0;
                    }
                    else
                    {
                        count++;
                    }
            }

            return count;



    }
}
