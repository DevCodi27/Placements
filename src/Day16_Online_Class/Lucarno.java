package Day16_Online_Class;

import javax.naming.PartialResultException;
import java.util.Scanner;

public class Lucarno {
    public static void lucar()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean ans = false;
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        int[] arr1 = new int[t];
        for (int i = 0;i<t;i++)
        {
            arr1[i]= sc.nextInt();
        }
        for (int i = 0;i<n-1;i++)
        {
            for(int j = 0;j<t-1;j++)
            {
                if(arr[i]==arr1[j])
                {
                    if (arr[i+1]==arr1[j+1])
                    {
                        ans = true;
                        break;
                    }
                }
            }
            if(ans)
            {
                break;
            }
        }
        if(ans)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
