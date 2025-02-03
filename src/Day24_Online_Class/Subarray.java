package Day24_Online_Class;

import java.util.Scanner;

public class Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int max = 0;
        for(int i = 0;i<=n-k;i++)
        {
            int sum = arr[i];
            for(int j = i+1;j<i+k;j++)
            {
                sum+=arr[j];
            }
            if(max<sum)
            {
                max = sum;
            }
        }
        double ans = (double)max/k;
        System.out.printf("%f",ans);
    }
}
