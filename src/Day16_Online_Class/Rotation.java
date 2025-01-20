package Day16_Online_Class;

public class Rotation {
    public static void Reverserotation()
    {
        int d = 1;
        int[] arr = {1,2,1,333,4,3,7};
        int temp = 0;
        System.out.println("Orginal Array");
        for (int i:arr)
        {
            System.out.print(i+" ");
        }
        for(int i = 0;i<d;i++)
        {
            temp = arr[arr.length-1];
            for(int j = arr.length-2;j>=0;j--)
            {
                arr[j+1]=arr[j];
            }
            arr[0] = temp;
        }
        System.out.println("\n\nRotated Array");
        for (int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
