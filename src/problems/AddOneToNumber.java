package problems;

import java.util.ArrayList;
import java.util.ListIterator;

public class AddOneToNumber {

    public static void main(String[] args)
    {
        int[] B={6,9,9};



        int[] tmp = plusOne(B);
        for(int i=0;i<tmp.length;i++)
        {
            System.out.println(tmp[i]);
        }
    }

    public static int[] plusOne(int[] A) {

        int carry =0;
        //ArrayList<Integer> al = new ArrayList<Integer>();
        int arrlen=0;

        if(A[0] ==9) {
            arrlen = A.length+1;
        }else
        {
            arrlen = A.length;
        }

        int[] result=new int[arrlen];
/*
        for(int a:A)
        {
            al.add(a);
        }
*/

        if(A.length >1)
        {


            if(A[A.length-1] != 9 )
            {
                for(int i=0;i<A.length-1;i++)
                {
                    //al.set(i,A[i]);
                    result[i]=A[i];
                }
                result[A.length-1]=A[A.length-1]+1;
                //al.set(A.length-1,A[A.length-1]+1);

            }else
            {
                result[A.length-1]=0;
                //al.set(A.length-1,0);
                for(int i=A.length-2;i>=0;i--)
                {
                    if(A[i] == 9)
                    {
                        if(i!=0)
                        {
                            result[i]=0;
                          //  al.set(i,0);
                           // carry=1;
                        }
                        else
                        {

                            result[i]=0;
                            result[0]=1;
                            //al.set(i,0);
                            //al.add(0,1);
                        }
                    }else
                    {

                        result[i]=A[i]+1;
                       // al.set(i,A[i]+1);
                        break;

                    }
                }
            }

        }else
        {
            // 9 -> [1 0]
            if(A[0] == 9)
            {
                result[1]=0;
                result[0]=1;
               // al.set(1,0);
               // al.add(0,1);
            }else
            {
                //8 ->  9
                result[0]=A[0]+1;
                //al.set(0,A[0]+1);
            }
        }



        //remove prefix zeros
        /*
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
        }*/

        int[] res = new int[result.length];

        for(int i=0;i<result.length;i++)
        {
            res[i] = result[i];
        }

        return res;
    }

}
