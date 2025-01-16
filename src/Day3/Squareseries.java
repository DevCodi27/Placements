package Day3;

public class Squareseries {
    public  void series(int n)
    {
        int i = 1;
        int ans;
        while(i<=n)
        {
            ans = i*i;
            if(i%2==0)
            {
                ans-=2;
            }
            else {
                ans-=1;
            }
            System.out.print(ans+" ");
            i++;
        }
    }
}
