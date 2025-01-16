package Day9;

import java.util.Scanner;

public class Consecutives {
    public static void max()
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        int cnt = 0;
        int max = 0;
        for(int i = 0;i<n;i++)
        {

            if (arr[i]==1)
            {
               cnt++;
            }
            else {
                max = Math.max(max,cnt);
                cnt = 0;
            }
        }
        max = Math.max(max,cnt);
        System.out.println(max);
    }
}
