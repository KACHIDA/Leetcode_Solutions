package problems;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class KthRowPascalTriangle {

    public static void main(String[] args)
    {
        System.out.println(getRow(5));
    }

    public static ArrayList<Integer> getRow(int A) {


        ArrayList<Integer> result = new ArrayList<Integer>();
        int count=0;

        ArrayList<ArrayList<Integer>> triangle  = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> first_row = new ArrayList<Integer>();


        if(A ==0 )
        {
            result.add(1);
            return result;
        }


        first_row.add(1);
        triangle.add(first_row);

        for(int i=1;i<=A;i++)
        {
            ArrayList<Integer> prev_row = triangle.get(i-1);
            ArrayList<Integer> row = new ArrayList<Integer>();
            row.add(1);
            for(int j=1;j<i;j++)
            {
                row.add(prev_row.get(j-1) + prev_row.get(j));

            }
            row.add(1);
            triangle.add(row);
            if(A == i)
            {
                for(int k:row)
                {
                    result.add(k);
                }
            }

        }




        return result;

    }
}
