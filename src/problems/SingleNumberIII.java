package problems;

public class SingleNumberIII {

    public static void main(String[] args)
    {
        int[] A= {1, 2, 3, 1, 2, 4};
        int[] res = singleNumber(A);
        for(int a:res) {
            System.out.println(a+",");
        }
    }
    public static int[] singleNumber(int[] nums) {

        int xorVal =0;
        for(int i=0;i<nums.length;i++)
        {
            xorVal = xorVal ^ nums[i];
        }

        //identify the L.S.B Set Bit
        int k=0;
        for(;k<64;k++)
        {
            if((xorVal & (1<<k)) >0)
            {
                break;
            }else
            {
                k++;
            }


        }
        int xorVal1=0,xorVal2=0;
        for(int i=0;i<nums.length;i++)
        {
            if((nums[i] & (1<<k)) >0)
            {
                xorVal1 = xorVal1 ^ nums[i];
            }else
            {
                xorVal2 = xorVal2 ^ nums[i];
            }
        }

        int[] res = new int[2];
        if(xorVal1 >= xorVal2)
        {
            res[1]= xorVal1;
            res[0]=xorVal2;
        }else
        {
            res[0]= xorVal1;
            res[1]=xorVal2;
        }

        return res;
    }
}
