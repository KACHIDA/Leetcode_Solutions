package problems;

public class ReverseBits {

    public static void main(String[] args)
    {
        long a = 3;
        System.out.println(reverse(a));
    }

    public static long reverse(long a) {

        int[] binary = new int[32];
        int index =0;
        //convert decimal to binary
        while(a>0)
        {
            binary[index++] = (int) (a%2);
            a=a/2;
        }

        StringBuilder sb = new StringBuilder();
        for(int tmp:binary)
        {
            sb.append(String.valueOf(tmp));
        }

        //System.out.println(sb.toString());
       //long binaryNumber =  Long.parseLong(sb.toString(),2);
        int strLen = sb.length()-1;
        //convert decimal to binary
        long decimal =0;
        long p=0;
        while(strLen>=0)
        {
            decimal +=  Character.getNumericValue(sb.charAt(strLen)) * Math.pow(2,p);
            p++;
            strLen--;

        }

        //System.out.println(decimal+",");
        return decimal;

    }
}
