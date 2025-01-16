package Day5;

public class SumOfDiagonal {
    public void sum(int[][] arr)
    {
        int sum = 0;
        int sum1=0;
        for(int i=0;i< arr.length;i++)
        {
            for(int j = 0;j<arr[1].length;j++)
            {
                if(i==j)
                {
                    sum+=arr[i][j];
                }

            }

        }
        for(int i=0;i< arr.length;i++)
        {
            for(int j = i;j<=i;j++)
            {

                sum1+=arr[i][arr.length-j-1];


            }

        }
        int ans = sum-sum1;
        if(ans<0)
        {
            ans*=-1;
        }
        System.out.println(ans);
    }
}
