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

        int i=0;
        while(i<A.length-1)
        {
            temp=A[i];
            A[i]=A[i+1];
            A[i+1]=temp;
            i=i+2;
        }


        return A;


    }
}
