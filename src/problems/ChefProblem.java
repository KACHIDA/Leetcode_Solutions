package problems;

import java.util.*;

public class ChefProblem {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int numberOfDays = in.nextInt();
        LinkedHashMap<String,Integer> ingHM = new LinkedHashMap<String,Integer>();
        for (int i = 0; i < numberOfDays; i++) {
            String ingredient = in.next();

            int temp=0;


                if(!ingHM.containsKey(ingredient))
                {
                    ingHM.put(ingredient,1);
                }else
                {
                    temp = ingHM.get(ingredient);
                    temp += 1;
                    ingHM.put(ingredient,temp);
                }


            //Check for Dish X
            boolean retXVal = dishX(ingHM);

            if(retXVal)
            {
                if(i == numberOfDays -1 && ingHM.size() >= 1)
                {
                    System.out.println("-");
                }
                else {
                    System.out.print("X");
                }
            }else
            {
                boolean retYVal = dishY(ingHM);
                if(retYVal)
                {
                    if(i == numberOfDays -1 && ingHM.size() >= 1)
                    {
                        System.out.println("-");
                    }
                    else {
                        System.out.print("Y");
                    }
                }else
                {
                    System.out.print("-");
                }
            }

        }




    }


    public static boolean dishX(LinkedHashMap<String,Integer> ingHM)
    {
        boolean result = false;
        int fatCount = 0;
        int fiberCount=0;
        int dishCount =0 ;

        for(Map.Entry<String,Integer> entry: ingHM.entrySet())
        {
            if(dishCount == 4 && fatCount >=2 )
            {
                break;
            }
            if(entry.getKey().contains("FAT"))
            {
                ++fatCount;
                ++dishCount;
            }else if(entry.getKey().contains("FIBER"))
            {
                ++fiberCount;
                ++dishCount;
            }

        }

        if(dishCount == 4  && fatCount >=2  )
        {
            result = true;
            //remove dishes from Map
            Iterator<Map.Entry<String,Integer>> iterator = ingHM.entrySet().iterator();
            while(iterator.hasNext())
            {
                Map.Entry<String,Integer> entry = iterator.next();
                if(entry.getKey().contains("FAT") && dishCount >0 && fatCount >0)
                {
                    iterator.remove();
                    --fatCount ;
                    --dishCount;
                }
                else if(entry.getKey().contains("FIBER") && dishCount > 0 && fiberCount > 0)
                {
                    iterator.remove();
                    --fiberCount ;
                    --dishCount;
                }
            }

        }



        return result;
    }


    public static boolean dishY(LinkedHashMap<String,Integer> ingHM)
    {
        boolean result = false;
        int fatCount = 0;
        int fiberCount=0;
        int carbCount=0;
        int dishCount =0 ;

        for(Map.Entry<String,Integer> entry: ingHM.entrySet())
        {
            if(dishCount == 4 && carbCount >=1 && fiberCount >=1)
            {
                break;
            }
            if(entry.getKey().contains("CARB"))
            {
                ++carbCount;
                ++dishCount;
            }else if(entry.getKey().contains("FIBER"))
            {
                ++fiberCount;
                ++dishCount;
            }

        }

        if(dishCount == 4  && carbCount >=1 && fiberCount >=1  )
        {
            result = true;
            //remove dishes from Map
            Iterator<Map.Entry<String,Integer>> iterator = ingHM.entrySet().iterator();
            while(iterator.hasNext())
            {
                Map.Entry<String,Integer> entry = iterator.next();
                if(entry.getKey().contains("CARB") && dishCount >0)
                {
                    iterator.remove();
                    --carbCount ;
                    --dishCount;
                }
                else if(entry.getKey().contains("FIBER") && dishCount > 0)
                {
                    iterator.remove();
                    --fiberCount ;
                    --dishCount;
                }
            }

        }



        return result;
    }
}
