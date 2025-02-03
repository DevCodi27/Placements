package Day25_Online_Class;

import java.util.Scanner;

public class ProductOfelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int prod = 1;
        for(int i = 0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }

        int[] res = new int[n];
        for(int i = 0;i<n;i++)
        {
            prod = 1;
            for (int j = 0;j<n;j++)
            {
            if(j!=i)
            {
                prod*=arr[j];
            }
            }
            res[i]= prod;
        }

        for (int i:res)
        {
            System.out.print(i+" ");
        }
    }
}
