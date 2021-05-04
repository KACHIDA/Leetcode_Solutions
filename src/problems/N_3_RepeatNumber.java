package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N_3_RepeatNumber {

    public static void main(String[] args)
    {
        int a[] = new int[] { 1000441, 1000441, 1000994 };
        List<Integer> al = new ArrayList<Integer>();
        for(int tmp:a)
        {
            al.add(tmp);
        }
        System.out.println(repeatedNumber(al));
    }

    static boolean isMajority(final List<Integer> al, int cand)
    {
        int count=0;
        for(int i=0;i<al.size();i++)
        {
            if(al.get(i) == cand)
            {
                count++;
            }


        }

        if(count > al.size()/3 )
        {
            return true;
        }else
        {
            return false;
        }

    }

    public static int findCandidate(final List<Integer> a)
    {
        int maj_index=0, count =1;
        int i;
        for(i=1; i<a.size();i++)
        {
            if(a.get(maj_index).equals(a.get(i)))
                    count++;
            else
                    count--;

            if(count == 0)
            {
                maj_index = i;
                count = 1;
            }

        }
        System.out.println("a.get(maj_index)" + a.get(maj_index));
        return a.get(maj_index);
    }




    public static int repeatedNumber(final List<Integer> a) {

        int cand = findCandidate(a);
        if(isMajority(a,cand))
        {
            return cand;
        }else
        {
            return -1;
        }


    }
}
