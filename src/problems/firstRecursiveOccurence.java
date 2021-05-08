package problems;

public class firstRecursiveOccurence {

    public static void main(String[] args)
    {
        System.out.println(firstOccurence("abcdefghijklmnopqrstuvwxyz",0));
    }

    public static int firstOccurence(String str,int index)
    {
        if(str.charAt(index) == 'x')
        {
            return index;
        }
        else
        {
            return firstOccurence(str,index+1);
        }

    }

}
