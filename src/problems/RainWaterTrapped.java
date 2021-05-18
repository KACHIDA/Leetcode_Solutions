package problems;

import java.util.ArrayList;

public class RainWaterTrapped {

    public static void main(String[] args)
    {
        int[] A={ 0, 1, 0, 2, 1, 0,
                1, 3, 2, 1, 2, 1  };
        System.out.println(trap(A));
    }

    public static int trap(int[] A)
    {
        int result=0;

        int[] left = new int[A.length];
        int[] right = new int[A.length];
        left[0]= A[0];


        for(int i=1;i<A.length;i++)
        {
            left[i]=Math.max(left[i-1],A[i]);
        }

        right[A.length-1]=A[A.length-1];
        for(int i=A.length-2;i>=0;i--)
        {
            right[i]=Math.max(right[i+1],A[i]);
        }

        for(int i=1;i<A.length-1;i++)
        {

            result += Math.min(left[i],right[i])-A[i];

        }

        return result;

    }
}
