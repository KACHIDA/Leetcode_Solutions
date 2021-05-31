package problems;

import java.util.ArrayList;

public class MaxNonNegativeSubArray {

    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(-1);
        al.add(2);
        al.add(3);
        al.add(-4);
        al.add(100);
        System.out.println(maxSet(al));
    }

    public static ArrayList<Integer> maxSet(ArrayList<Integer> A)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int negativeNumPos = -1,curr_index=-1 ;
        int curr_sum=0,sum=0,start_index=0;
        for(int i=0;i<A.size();i++)
        {
            if(A.get(i) >= 0) {
                curr_sum += A.get(i);
            }else
            {
                negativeNumPos=i;
                curr_index=i;
                break;
            }
        }

        if(negativeNumPos != -1)
        {


            for(int i = negativeNumPos ; i<A.size(); i++)
            {
                if(A.get(i) < 0 )
                {
                    negativeNumPos = i;
                    if(curr_sum >=  sum ) {
                        sum = curr_sum;
                        for (int j = start_index; j < negativeNumPos; j++) {
                            result.add(A.get(j));
                        }


                    }else {


                    }

                    start_index = i+1;
                    curr_sum=0;

                }else
                {
                    curr_sum += A.get(i);

                }
            }

        }

        if(curr_sum >= sum)
        {
            for(int i = start_index ; i<A.size(); i++)
            {
                result.add(A.get(i));
            }
        }
        return result;
    }

}
