public class PerfectNumber
{
       public int pnumber(int n)
       {
           int ans = 0;
           int sum = 0;
            for(int i = 1;i<=n/2;i++)
            {
                if(n%i == 0)
                {
                    sum += i;
                }
            }

            if(n == sum)
            {
                ans = 1;
            }

            return ans;
       }
}
