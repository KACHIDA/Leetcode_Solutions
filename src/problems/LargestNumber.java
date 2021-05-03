package problems;

import java.util.*;

public class LargestNumber {

    public static void main(String[] args) {

            int A[]={24, 45, 67, 90, 94};
            System.out.println(largestNumber(A));
    }

    public static String largestNumber(final int[] nums) {

        Comparator<Long> integerCompare = new Comparator<Long>(){

            public int compare(Long x, Long y)
            {
                String s1= String.valueOf(x);
                String s2= String.valueOf(y);

                //return  Long.parseLong(s1+s2).compareTo(Long.parseLong(s2+s1));

                return (new Long(s1+s2)).compareTo(new Long(s2+s1));

            }

        };

        ArrayList<Long> al = new ArrayList<>();
        for(int a:nums)
        {
            al.add(Long.valueOf(a));
        }

        if(nums.length>1)
        {
            HashSet<Long> uniqueSetCheck = new HashSet<Long>(al);
            if( uniqueSetCheck.size() <=1 ) {


                StringBuilder sb1 = new StringBuilder();

                if(al.get(0) == 0)
                {
                    for (int i = 0; i < 1; i++) {
                        sb1.append(al.get(i));
                    }

                }else
                {
                    for (int i = 0; i < al.size(); i++) {
                        sb1.append(al.get(i));
                    }
                }

                return sb1.toString();
            }
        }

        Collections.sort(al,integerCompare);

        StringBuilder sb = new StringBuilder();
        for(int i=al.size()-1;i>=0;i--)
        {
            sb.append(al.get(i));
        }

        return sb.toString();

    }
}