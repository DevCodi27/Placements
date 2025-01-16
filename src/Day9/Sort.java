package Day9;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void sort()
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int min = 0, max = 0;
        for(int i = 0;i<4;i++)
        {
            min+=arr[i];
            max+=arr[i+1];
        }
        System.out.println(min+" "+max


        );
    }
}
