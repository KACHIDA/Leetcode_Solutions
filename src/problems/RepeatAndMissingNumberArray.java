package problems;
import java.util.ArrayList;
import java.util.List;

public class RepeatAndMissingNumberArray {

    public static void main(String[] args)
    {
       System.out.println(repeatedNumber( List.of(3,1,2,5,3) ));
    }

    public static ArrayList<Integer> repeatedNumber(final List<Integer> A) {

        int max=0;
        int min = 99999999;

        for(int j=0;j<A.size();j++)
        {
            if(A.get(j) > max)
            {
                max = A.get(j);
            }
        }

        int i = 1,missing_num=0;
        while(i <= A.size())
        {
            if(!A.contains(i))
            {
                missing_num = i;
                break;
            }
            i++;

        }

        int k=1,total_sum=0;
        while(k <= A.size())
        {
            total_sum += k;
            k++;
        }

        int calc_sum = missing_num;
        for(int j=0;j<A.size();j++) {
                calc_sum +=  A.get(j);
        }
        int dup_num = 0;
        if(calc_sum >=  total_sum)
        {
            dup_num = calc_sum - total_sum;
        }else
        {
            dup_num = total_sum - calc_sum;
        }

        System.out.println("dup_num -> "+dup_num);
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(dup_num);
        result.add(missing_num);
        return result;

    }
}
