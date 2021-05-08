package problems;

public class FindPeakElement {

    public static void main(String[] args) {
        int[] A = {2,3};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {

        int start = 0;
        int end = A.length ;
        int mid = 0,res =0;
        if(A.length>1)
        {
            while (start <= end) {
                mid = ((start + end) / 2);
                if(mid == A.length-1 && (A[mid] >= A[mid-1]))  {
                    res = A[mid];
                    break;
                }
                else if(mid == A.length-1 && (A[mid] <= A[mid-1]))  {
                    res = A[mid-1];
                    break;
                }
                else if((mid == 0) && A[mid] >= A[mid + 1] )
                {
                    res = A[mid];
                    break;
                }
                else if (A[mid] >= A[mid + 1] && A[mid] >= A[mid - 1]) {
                    res = A[mid];
                    break;
                } else if (A[mid - 1] > A[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        else
        {
            res = A[0];
        }
        return res;

    }
}