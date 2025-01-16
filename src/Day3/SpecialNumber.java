package Day3;

public class SpecialNumber {
    public void special(int n)
    {
        if(n>=100||n<10)
        {
            System.out.println("Invalid");
        }
        else {
            int sum= 0;
            int prod = 1;
            for(int i = 10;i<=n;i++)
            {
                int rem;
                rem = i%10;
                int num = i/10;
                sum=rem+num;
                prod = rem*num;
                int ans = sum+prod;
                if(ans == i)
                {
                    System.out.print(ans+" ");
                }

            }
        }
    }
}
