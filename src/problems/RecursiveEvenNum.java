package problems;

import java.util.ArrayList;

public class RecursiveEvenNum {

    public static void main(String[] args)
    {
        int[] a={1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> al = new ArrayList<>();
        recursiveEvenNum(a,0,al);
        for(int tmp:al)
        {
            System.out.println(tmp+",");
        }

    }

    public static  int  recursiveEvenNum(int[] A,int index,ArrayList<Integer> evenNum)
    {
        if(index == A.length)
        {
            return 0;
        }
        if(A[index]%2 ==0) {
            evenNum.add(A[index]);
        }
        return recursiveEvenNum(A,index+1,evenNum);

    }

}
