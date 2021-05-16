package problems;

import java.util.ArrayList;
import java.util.Collections;

public class MaxChunks {

    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(2);
        al.add(0);
        al.add(1);
        al.add(2);
        System.out.println(solve(al));

    }
    public static int solve(ArrayList<Integer> A) {

        int max=-99999;
        int count=0;

        for(int i=0;i<A.size();i++)
        {
          max = Math.max(max,A.get(i));

          if(i == max)
          {
              count++;
          }
        }

        return count;


    }

}
