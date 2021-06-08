package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.HashMap;
import java.util.Map;

public class N_3_RepeatNumber {

    public static void main(String[] args)
    {

        List<Integer> a = List.of(1,2,3,1,1);

        int nByThreeNum = a.size()/3;
        int result = -1;

        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<a.size();i++)
        {
            if(!hm.containsKey(a.get(i)))
            {
                hm.put(a.get(i),1);
            }else
            {
                int val = hm.get(a.get(i));
                val +=1;
                hm.put(a.get(i),val);
            }
        }

        int max=0;
        for(Map.Entry<Integer,Integer> entry: hm.entrySet())
        {
            if(entry.getValue() > nByThreeNum)
            {
                result = entry.getKey();
            }
        }

        System.out.println(result);
    }



}
