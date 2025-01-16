package Day14_Online_Class;

public class ElementNotMatch {
    public static void nm()
    {
        int[] arr = {0,1,3,0,2,4,2,2,};
        int k = 2;
        int cnt = 0;
        int j = 0;
        for(int i = 0;i< arr.length;i++)
        {
            if(arr[i]!=k)
            {
                cnt++;
            }
            j++;
        }

        System.out.print(cnt);
    }
}
