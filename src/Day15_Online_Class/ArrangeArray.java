package Day15_Online_Class;

import java.util.Scanner;

public class ArrangeArray {
    public static void arrange()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int[] arr2 = new int[n];
        int j = 0;
        int k = 0;
        for(int i = 0;i<n;i++)
        {
            if(i%2==0)
            {
                arr2[i] = arr[n-j-1];
                j++;
            }
            else {
                arr2[i] = arr[k];
                k++;
            }
        }
        for (int i: arr2)

        {
            System.out.print(i+" ");
        }
    }
}
