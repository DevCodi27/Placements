package Day11_Regular_Expressions;

import java.util.ArrayList;
import java.util.Scanner;

public class LuckyNumber {
    public static int count = 2;
    public static void lucky_number()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
       for(int i = 0;i<n;i++)
       {
           arr[i]=i+1;
       }
       int k = 2;
        ArrayList<Integer>ls;
       int[] arr2;
       while (k<n)
       {
           ls = new ArrayList<>();
          for(int i = 0;i<n;i++)
          {
              if((i+1)%k!=0)
              {
                  ls.add(arr[i]);
              }
          }
          n = ls.size();
          arr = new int[n];
          for(int i = 0;i<n;i++)
          {
              arr[i]=ls.get(i);
          }
          k++;
       }
       for(int i:arr)
       {
           System.out.print(i+" ");
       }
    }
}
