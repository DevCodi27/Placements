public class Rightstar {
    int n;
    public Rightstar(int n)
    {
        this.n = n;
    }

    public void  pattern() {

        for(int i = 0;i<n;i++)
        {
            for (int j = 0;j<i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void rpattern()
    {
        for(int i = 0;i<n;i++)
        {
            for(int j = n-i-1;j>=0;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
