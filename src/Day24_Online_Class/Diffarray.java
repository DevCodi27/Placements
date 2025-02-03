package Day24_Online_Class;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Diffarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int i = 0;i<n;i++)
        {
            arr2[i] = sc.nextInt();
        }
        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
        ArrayList<Integer> row = new ArrayList<>();
        for(int i = 0;i<n;i++)
        {

            boolean flag = false;
            for (int j = 0;j<n;j++)
            {
                if(arr[i]==arr2[j])
                {
                    flag =true;

                }


            }
            if(!flag)
            {
                row.add(arr[i]);
            }

        }
        ls.add(row);
         row = new ArrayList<>();

        for(int i = 0;i<n;i++)
        {

            boolean flag = false;
            for (int j = 0;j<n;j++)
            {
                if(arr2[i]==arr[j])
                {
                    flag = true;
                }


            }
            if(!flag)
            {
                row.add(arr2[i]);
            }

        }
        ls.add(row);
        System.out.println(ls);
    }
}
