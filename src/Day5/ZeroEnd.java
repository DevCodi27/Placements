package Day5;

public class ZeroEnd {
    public void zero(int[] arr,int n)
    {
        int[] temp = new int[n];
        int k = 0;
        for(int i = 0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[k++]=arr[i];
            }
        }
        for(int i = k;i<n;i++)
        {
            arr[i] = 0;
        }
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
