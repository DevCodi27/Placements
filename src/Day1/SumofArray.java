package Day1;

public class SumofArray {

    public void sum(int[] arr,int n)
    {
        long sum = 0;
        for(int i = 0;i<n;i++)
        {
            sum+=arr[i];
        }

        System.out.println(sum);
    }
}
