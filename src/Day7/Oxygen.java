package Day7;

public class Oxygen {
    public  void oxy(int[][] arr)
    {
        int[] ar = new int[3];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<3;i++)
        {
            sum = 0;
            for(int j = 0;j<3;j++)
            {

                sum+=arr[j][i];
            }
            ar[i] = Math.round(sum/3.0f);
            max = Math.max(max,ar[i]);
        }
        if(max < 70)
        {
            System.out.println("All Trainee are unfit");
        }
        for(int i = 0;i< ar.length;i++)
        {
            if(ar[i]==max)
            {
                System.out.println("Tranie Number :"+(i+1));
            }

        }
    }

}
