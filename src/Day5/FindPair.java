package Day5;

public class FindPair {
    public void pair(int[] arr,int n,int target)
    {
        int cnt = 0;
        for(int i = 0;i<n-1;i++)
        {

            for(int j = i+1;j<n;j++)
            {

                if(arr[i]+arr[j]==target)
                {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
