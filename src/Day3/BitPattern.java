package Day3;

public class BitPattern {
    public void ptn(int n)
    {
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<i+1;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print(1+" ");
                }
                else {
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
