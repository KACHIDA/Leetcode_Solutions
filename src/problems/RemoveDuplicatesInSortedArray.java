package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class RemoveDuplicatesInSortedArray {

    public static void main(String[] args)
    {
        int[] arr = {8,8, 8, 8, 1, 1, 1,2, 2, 3, 3, 3};
        CopyOnWriteArrayList<Integer> intList = new CopyOnWriteArrayList<Integer>();
        for (int i : arr)
        {
            intList.add(i);
        }
       System.out.println(removeDuplicates(intList));
    }

    public static int removeDuplicates(CopyOnWriteArrayList<Integer> a) {

        int startVal =0,count=0,currVal=-1;
        if(a.size() > 0)
        {
            startVal = a.get(0);
            ++count;
        }

        int i=0;
        Iterator<Integer> iter = a.iterator();

        while(iter.hasNext())
        {
            currVal=iter.next();
            if(startVal == currVal)
            {
                if(count >= 2)
                {
                    a.remove(i);
                    --i;

                }
                else
                {
                    ++count;
                    i++;
                }

            }else
            {
                count=0;
                startVal = currVal;
                i++;
            }



        }

        return a.size();

    }

}
