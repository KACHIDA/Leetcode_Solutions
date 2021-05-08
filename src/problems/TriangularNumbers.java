package problems;

public class TriangularNumbers {

    public static void main(String[] args)
    {

        int n=7;
        int result=n;
       int res = triangularNumbers(n);
       System.out.println(res);

    }

    public static int triangularNumbers(int n)
    {
        int result = n;
        if(n == 0)
        {
            return 0;
        }
        else {
            return result + triangularNumbers(n - 1);
        }


    }



}
