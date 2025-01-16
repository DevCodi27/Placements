package Day6;

public class SumofEle {
    public void arr(int[] arr)
    {
        int n = arr.length;
        int[] arr1;
        for(int j = 0;j<arr.length;j++)
        {
            System.out.print(arr[j]+" ");
        }
        System.out.println();
        for(int i = 0;i<n;i++)
        {

            arr1 = new int[arr.length-1];
            int n1= arr1.length;
            for(int k = 0;k<n1;k++)
            {
                arr1[k]=arr[k]+arr[k+1];
            }
            for(int j = 0;j<arr1.length;j++)
            {
                System.out.print(arr1[j]+" ");
            }
            arr = new int[arr1.length];
            for(int m = 0;m<arr1.length;m++)
            {
                arr[m]=arr1[m];
            }
            System.out.println();
        }

    }
}
