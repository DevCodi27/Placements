package Day25_Online_Class;

import java.util.Scanner;

public class LongestZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;
        for(int i = 0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        for(int i = 0;i<n;i++)
        {
            int[] temp = new int[n-1];
            int t = i;
            int k = 0;
            for(int j = 0;j<n;j++)
            {
                if(j!=t)
                {
                    temp[k]=arr[j];
                    k++;
                }
            }

            int cnt = 0;
            for(int l = 0;l<temp.length;l++)
            {
                if(temp[l]==1)
                {
                    cnt++;
                }
                else {
                   cnt = 0;

                }
                if(max<cnt)
                {
                    max=cnt;
                }
            }
        }
        System.out.println(max);
    }
}
