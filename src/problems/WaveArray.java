package problems;

import java.util.Arrays;

public class WaveArray {

    public static void main(String[] args)
    {
        int A[] ={1,2,3,4};
        int B[]=wave(A);
        for(int a:B)
        {
            System.out.println(a+",");
        }
    }

    public static int[] wave(int[] A) {


        Arrays.sort(A);
        int temp=0;

        for(int i=0;i<A.length && (i+2) <= A.length;i=i+2)
        {
            temp=A[i];
            A[i]=A[i+1];
            A[i+1]=temp;
        }


        return A;


    }
}
