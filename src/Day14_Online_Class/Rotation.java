package Day14_Online_Class;

    public class Rotation {
        public static void rotation()
        {
            int d = 4;
            int[] arr = {1,2,3};
            int temp = 0;
            for(int i = 0;i<d;i++)
            {
                temp = arr[0];
                for(int j = 1;j<arr.length;j++)
                {
                    arr[j-1]=arr[j];
                }
                arr[arr.length-1] = temp;
            }

            for (int i:arr)
            {
                System.out.print(i+" ");
            }
        }
    }
