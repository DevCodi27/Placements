package Day6;

public class TransposeMatrix {
    public void transpose(int[][]arr)
    {
        for(int i = 0;i< arr[1].length;i++)
        {
            for (int j = arr.length-1;j>=0;j--)
            {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
