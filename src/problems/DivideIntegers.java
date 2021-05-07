package problems;

public class DivideIntegers {

    public static void main(String[] args)
    {
        System.out.println(divide(28,5));
    }

    public static int divide(int A, int B) {

        return (int) Math.floor(A>>B);

    }
}
