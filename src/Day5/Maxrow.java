package Day5;

public class Maxrow {
    public void sumrow(int[][]arr,int n,int m)
    {
        int sum = 0;
        int max = 0;
        int index = 0;
        for(int i = 0;i<n;i++)
        {
            sum = 0;
            for(int j = 0;j<m;j++)
            {
                sum+=arr[i][j];
            }
            if(max<sum)
            {
                max = sum;
                index=i;
            }
        }
        System.out.println(index+1);
    }
}
