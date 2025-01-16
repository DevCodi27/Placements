package Day3;

public class AddFive {
    public void series(int n)
    {
        int sum = 6;
        int i = 1;
        while(i<=n)
        {
            System.out.print(sum+" ");
            sum=sum+5*i;
            i++;

        }

    }
}
