package problems;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class DuplicateRowsInBinaryMatrix {
    
    public static void main(String[] args)
    {
        ArrayList<ArrayList<Integer>> parentAl = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(1);
        al.add(1);
        al.add(1);
        al.add(0);

        parentAl.add(al);

        ArrayList<Integer> al1 = new ArrayList<Integer>();

        al1.add(0);
        al1.add(0);
        al1.add(0);
        al1.add(1);

        parentAl.add(al1);

        ArrayList<Integer> al2 = new ArrayList<Integer>();

        al2.add(1);
        al2.add(1);
        al2.add(1);
        al2.add(0);

        parentAl.add(al2);

        ArrayList<Integer> al3 = new ArrayList<Integer>();

        al3.add(0);
        al3.add(0);
        al3.add(0);
        al3.add(1);

        parentAl.add(al3);

        System.out.println(solve(parentAl));

    }
    
    public static ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();

       for(int i=0;i<A.size();i++)
       {
          ArrayList<Integer> tmp = A.get(i);
          for(int j=i+1;j<A.size();j++)
          {
              ArrayList<Integer> tmp2 = A.get(j);
              if(tmp.equals(tmp2))
              {
                  result.add(j+1);
                  break;
              }
          }
       }

        Collections.sort(result);
        return result;
    }
}
