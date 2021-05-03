package problems;

public class ColumnSum {

    public static void main(String[] args)
    {
        int[][] A={{1,2,3,4},{5,6,7,8},{9,2,3,4}};
        int[] b = solve(A);
        for(int tmp:b)
        {
            System.out.println(tmp+",");
        }
    }

    public static int[] solve(int[][] A) {

        int[] result = new int[A[0].length];
        int rowlen = A.length;
        int columnlen = A[0].length;
        int i=0,j=0;
        while(j<columnlen)
        {
            i=0;
            int sum=0;
            while(i<rowlen) {
                sum+=A[i][j];
                i++;
            }
            result[j]=sum;
            System.out.println("");
            j++;
        }
        return result;


    }
}
