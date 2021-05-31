package problems;

import java.util.ArrayList;

public class MaxNonNegativeSubArray {

    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(5);
        al.add(-7);
        al.add(2);
        al.add(3);
    }

    public ArrayList<Integer> maxSet(ArrayList<Integer> A)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int negativeNumPos = -1,curr_index=-1 ;
        int curr_sum=0,sum=0,start;
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
                    if(curr_sum >=  sum && start_index < curr_index )
                    for(int i=0;i<negativeNumPos;i++)
                    {
                        result.add(A.get(i));
                    }
                    continue;

                }else
                {

                }
            }

        }

    }

}
