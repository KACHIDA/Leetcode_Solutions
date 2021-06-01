package problems;

/*
* PS: Given an integer A which denotes the number of people standing in the queue.

A selection process follows a rule where people standing on even positions are selected. Of the selected people a queue is formed and again out of these only people on even position are selected.

This continues until we are left with one person. Find and return the position of that person in the original queue.
*
Input 1:

 A = 10

  Output 1:

 8
 *
 * Initially, people at 2, 4, 6, 8, 10 position are selected.
 Then 4, 8 are selected since 4 at 2nd position and 8 at 4th position in the new queue.
 Finally 8 is selected.
* */

public class FindingPositions {

    public static void main(String[] args)
    {
        int A=10;
        System.out.println(solve(A));
    }

    public static  int solve(int A) {

        int  value  =  1 ;

        while  ( value  <=  A)
        {
            value  =  value  <<  1 ;
        }

        return value/2;

    }
}
