package problems;

import java.util.Calendar;

public class SecondFriday {

    public static void main(String[] args)
    {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.FRIDAY));
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(dayOfMonth);


    }
}
