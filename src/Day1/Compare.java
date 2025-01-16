package Day1;

public class Compare {
    public  void cmp(int[] arr,int[] arr2)
    {
        int a1=0,a2=0;
        int[] ans = new int[2];
        for(int i = 0;i<3;i++)
        {
            if(arr[i]>arr2[i])
            {
                a1++;
            } else if (arr[i]<arr2[i]) {
                a2++;
            }
            else{
                continue;
            }
        }
        ans[0]=a1;
        ans[1]=a2;

        for(int a:ans)
        {
            System.out.print(a+" ");
        }
    }
}
