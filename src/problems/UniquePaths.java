package problems;

public class UniquePaths {

    public static void main(String[] args)
    {
       System.out.println( unique_paths(2,3));
    }

    public static int unique_paths(int rows,int columns)
    {
        if(rows ==1 || columns == 1)
        {
            return 1;
        }
        if(rows == 2)
        {
            return columns;
        }
        if(columns == 2)
        {
            return rows;
        }
        return unique_paths(rows-1,columns) + unique_paths(rows,columns-1);
    }
}
