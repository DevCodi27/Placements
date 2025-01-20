package Day17_OnlineClass;

import java.util.Scanner;

public class Arrayarrangement {
    public static void pnarray()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        if(arr[0]>0)
        {
            int j = 0;
            for(int i = 0;i<n;i++)
            {
                if(arr[i]>0)
                {
                    arr1[j] = arr[i];
                }
                j++;
            }
        }
    }
}
