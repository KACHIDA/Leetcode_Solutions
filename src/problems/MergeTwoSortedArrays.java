package problems;

public class MergeTwoSortedArrays {

    public static void main(String[] args)
    {
        int A[] = {4,7,9};
        int B[] = {2,11,19};
        int C[]= new int[A.length+B.length];
        C=solve(A,B);
        for(int i:C)
        {
            System.out.print(i+" ,");
        }
    }

    public static int[] solve(final int[] A, final int[] B) {
        int[] result = new int[A.length+B.length];
        int i=0,j=0,k=0;
        while(i<A.length && j<B.length)
        {
            if(A[i] < B[j]) {
                result[k] = A[i];
                ++i;
                ++k;
            }else if(A[i] == B[j])
            {
                result[k]=A[i];
                ++k;
                ++i;

                result[k]=B[j];
                ++j;
                ++k;

            }
            else
            {
                result[k]=B[j];
                ++j;
                ++k;
            }
        }

        while(i<A.length)
        {
            //add remaining elements of Array A in result
            result[k]=A[i];
            ++i;
            ++k;
        }

        while(j<B.length)
        {
            //add remaining elements of Array B in result
            result[k]=B[j];
            ++j;
            ++k;

        }

        return result;

    }


}
