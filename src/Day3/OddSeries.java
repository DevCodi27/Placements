package Day3;

public class OddSeries {
    public void serve(int n)
    {
        int i = 1;
        int sum = 1;
        System.out.print(sum+" ");
        int temp = sum;
        while(i<=n)
        {

           if(i%2==0)
           {
               sum+=temp;
               temp = sum;
           }
           else {
               sum*=2;

           }
            System.out.print(sum+" ");
           i++;

        }

    }
}
