package problems;

import java.util.ArrayList;

public class ConstructArray {


    public static void main(String[] args)
    {

        int A=5;
        int B=17;
        int C=32;
        int diff = C-B;
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        for(int i=1;i<=diff;i++)
        {
            if(diff%i == 0)
            {
                al.add(solve(A,B,C,i));
            }
        }

        int tmpMin=10000000;
        int tmpMax=10000000;
        ArrayList<Integer> opArrayList = new ArrayList<Integer>();
        //get shortest Min and shortest Max values
        for(ArrayList<Integer> tmp : al)
        {


          if( tmp.get(0) <= tmpMin &&   tmp.get(tmp.size()-1) <=  tmpMax && tmp.contains(B) && tmp.contains(C) )
          {
               tmpMin =  tmp.get(0);
               tmpMax = tmp.get(tmp.size()-1);
              opArrayList = tmp;
          }


        }

        System.out.println(opArrayList);



    }

    public static ArrayList<Integer> solve(final int A, final int B, final int C, final int diff)
    {

        int val = B;
        int start =B;
        int n = 2;
        while(val >= 1 && n < A )
        {
                n++;
                if(val-diff >=1 ) {
                    val = val - diff;
                }else
                {
                    break;
                }
        }

        if(start != val )
        {
            start = val;
        }

        ArrayList<Integer> result = new ArrayList<Integer>();
        int res = start;
        for(int i=0;i<A;i++)
        {
            result.add(res);
            res =res+diff;

        }

        return result;

    }

}
