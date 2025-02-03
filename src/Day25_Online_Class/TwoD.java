package Day25_Online_Class;

import java.util.Scanner;

public class TwoD {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[][]arr = new int[n][n];
        int[]sarr;
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
        int cnt = 0;
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                boolean flag = true;
                for (int k = 0;k<n;k++)
                {
                    if(arr[i][k]!=arr[k][j])
                    {
                        flag = false;
                        break;
                    }
                }
                if(flag)
                {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
