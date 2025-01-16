package Day6;

public class LargestNum {
    public void num(int[] arr)
    {
        int[] arr1 = new int[arr.length];
        int max=0;
        boolean flag = false;
        for(int i = 0;i< arr.length;i++)
        {
            for(int j = 0;j<arr.length;j++)
            {
                String str = String.valueOf(arr[i]);
                char ch = str.charAt(0);
                int num = ch - '0';
                if(max<num)
                {
                    max = num;
                    arr1[i]=arr[j];
                }
            }


        }

    }
}
