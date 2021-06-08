package problems;

public class ReverseTheSentence {

    public static void main(String[] args)
    {

        String s = "The Daily Byte";
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            sb.append(s.charAt(i));
        }

        System.out.println("sb -->  " + sb.toString());
    }



}
