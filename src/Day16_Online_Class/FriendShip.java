package Day16_Online_Class;

import java.util.Scanner;

public class FriendShip {
    public static void friend()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int ans = n;
        for(int i = 0;i<n-1;i++)
        {
            for(int j = i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    ans--;
                }
            }
        }
        System.out.println(ans);
    }
}
