package problems;

public class FindLargestSum {

    public static void main(String[] args) {
        int[] a={1,3,5,7,9,10,14};
        int[] b={2,5,6,9,11,12};

        int sum = findLargestSum(a,b);
        System.out.println(sum);
    }

    private static int findLargestSum(int[] a, int[] b) {


        int i=0,j=0;
        int iSum=0,jSum=0,sum=0;

        while(i<a.length && j<b.length)
        {
            if(i<j)
            {
                i++;
                iSum+=iSum;

            }else if(j<i)
            {
                j++;
                iSum+=jSum;
            }
            else if( i == j)
            {
                sum = Math.max(iSum,jSum);
                i++;
                j++;
            }
        }


        return 0;
    }
}
