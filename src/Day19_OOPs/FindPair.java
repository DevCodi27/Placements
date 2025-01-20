package Day19_OOPs;

import java.util.Scanner;

public class FindPair {
    public int[] getElement(int n)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public void findPair(int[] arr,int d)
    {
        int n = arr.length;
            for(int i = 0;i<n;i++)
            {
                for (int j = 0;j<n;j++)
                {
                    if(arr[i]+arr[j] == d)
                    {
                        System.out.println(arr[i]+" "+arr[j]);
                    }
                }
            }
    }
}
