package Day5;

public class AddIndex {
    public void sum(int n ,int m)
    {
        int[][] arr =new int[n][m];
        for (int i = 0;i< n;i++)
        {
            for (int j = 0;j<m;j++)
            {
                arr[i][j] = i+j;
            }
        }

        for (int i = 0;i< n;i++)
        {
            for (int j = 0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
