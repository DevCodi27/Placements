package Day14_Online_Class;

import java.util.regex.Matcher;

public class Buystocks {
    public static void stocks()
    {
        int[] arr = {7,1,5,3,6,4};
        int buy = arr[0];
        int sell = 0;
        int index = 0;
        for(int i = 0;i<arr.length;i++)
        {
            int min = arr[i];
            if(min<buy)
            {
                buy = min;
                index = i;
            }

        }
        for (int i = index+1;i<arr.length;i++)
        {
            int max = arr[i];
            if(max>sell)
            {
                sell = max;
            }
        }
        if(buy>sell||sell==arr[0])
        {
            System.out.println(0);
        }
        else {
            System.out.println(sell-buy);
        }
    }
}

