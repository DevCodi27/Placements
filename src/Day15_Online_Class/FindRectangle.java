package Day15_Online_Class;

import java.util.HashMap;
import java.util.Scanner;

public class FindRectangle {
    public static void rec()
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        for(int i:arr)
        {
            hm.put(i, hm.getOrDefault(i,0)+1);
        }
        int cnt = 0;
        for(int i:hm.keySet())
        {
            if(hm.get(i)%2==0)
            {
                cnt++;
            }
        }
        if(cnt == 0)
        {
            System.out.println(-1);
        }
        else {
            System.out.println(cnt);
        }

    }
}
