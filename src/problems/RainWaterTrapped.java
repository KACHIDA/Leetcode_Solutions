package problems;

public class RainWaterTrapped {

    public static void main(String[] args)
    {
        int[] A={ 0, 1, 0, 2, 1, 0,
                1, 3, 2, 1, 2, 1  };
        System.out.println(trap(A));
    }

    public static int trap(int[] A)
    {
        int left=0,right=0,result=0;
        for(int i=1;i<A.length-1;i++)
        {

            left=A[i];
            for(int j=0;j<i;j++)
            {
                left = Math.max(A[j],left);
            }

            right=A[i];
            for(int k=i+1;k<A.length;k++)
            {
                right = Math.max(A[k],right);
            }

            result += Math.min(left,right)-A[i];

        }

        return result;

    }
}
