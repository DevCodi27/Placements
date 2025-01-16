package Day5;

import javax.swing.plaf.metal.OceanTheme;

public class FirstLastOccurance {
    public int[] present(int[] arr,int find)
    {
        int firstOccurance = 0;
        int lastOccurance = 0;
        int n = arr.length;
        for(int i = 0;i<n;i++)
        {
            if(arr[i]==find)
            {
                firstOccurance = i;
                break;
            }
        }
        for (int i= 0;i<n;i++)
        {
            if(arr[i]==find)
            {
                lastOccurance=i;
            }
        }
        int[] ans = new int[2];
        ans[0]=firstOccurance;
        ans[1]=lastOccurance;
        return ans;

    }
}
