package problems;

import java.util.ArrayList;
import java.util.ListIterator;

public class AddOneToNumber {

    public static void main(String[] args)
    {
        int[] B={0,6,0,4,5,3};
        int[] tmp = plusOne(B);
        for(int i=0;i<tmp.length;i++)
        {
            System.out.println(tmp[i]);
        }
    }

    public static int[] plusOne(int[] A) {

        int carry =0;
        ArrayList<Integer> al = new ArrayList<Integer>();

        for(int a:A)
        {
            al.add(a);
        }


        if(al.size()>1)
        {
            if(A[A.length-1] != 9 )
            {
                for(int i=0;i<A.length-1;i++)
                {
                    al.set(i,A[i]);
                }
                al.set(A.length-1,A[A.length-1]+1);

            }else
            {
                al.set(A.length-1,0);
                for(int i=A.length-2;i>=0;i--)
                {
                    if(A[i] == 9)
                    {
                        if(i!=0)
                        {
                            al.set(i,0);
                            carry=1;
                        }
                        else
                        {
                            al.set(i,0);
                            al.add(0,1);
                        }
                    }else
                    {

                        al.set(i,A[i]+1);
                        break;

                    }
                }
            }

        }else
        {
            if(al.get(0) == 9)
            {
                al.set(0,0);
                al.add(0,1);
            }else
            {
                al.set(0,A[0]+1);
            }
        }



        //remove prefix zeros
        ListIterator<Integer> li = al.listIterator();

        while(li.hasNext())
        {
            if(li.next() == 0)
            {
                li.remove();
            }else
            {
                break;
            }
        }

        int[] result = new int[al.size()];

        for(int i=0;i<al.size();i++)
        {
            result[i] = al.get(i);
        }

        return result;
    }

}
