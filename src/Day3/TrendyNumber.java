package Day3;

public class TrendyNumber {
    public void trendy(int n)
    {
        int div = n/10;
        int rem = div%10;
        if(rem%3==0)
        {
            System.out.println("Trendy Number");
        }
        else
        {
            System.out.println("Not a Trendy Number");
        }
    }
}
