package problems;



public class StringSplitEx {


    public static void main(String[] args)
    {
        String str = "Payment System examples";
        String[] strArr = str.split(" ");
        int i=1,j=1;
        int n= strArr.length-1;
        while(n>=0)
        {

            if(n%2 == 1)
            {
                i=j-1;
                j=0;
            }
            else {
                i = 0;
                j = j + 1;
            }

            System.out.println(strArr[i] + " " + strArr[j] );
            --n;
        }



    }

}
