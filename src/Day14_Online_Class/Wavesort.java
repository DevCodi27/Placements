package Day14_Online_Class;

import java.util.Arrays;

public class Wavesort {
    public static void sort()
    {
        int[] arr = {20,10,8,6,4,2};
        int temp;
        for(int i = 0;i< arr.length-1;i++)
        {
            if(i%2==0)
            {
                if(arr[i]<arr[i+1])
                {
                    temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i]=temp;
                }
            }
            else
            {
                if(arr[i]>arr[i+1])
                {
                    temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }

        }
        for (int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
