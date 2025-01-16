package Day4;

public class PyramidPattern {
    public void pth(int n)
    {
        int k = 0;
        for(int i = 0;i<n;i++)
        {
            k=0;
            for(int j = 0;j<n*2-1;j++)
            {
                if(i>j)
                {
                    System.out.print(" ");
                    k++;
                }
                else if(j<n*2-i-1){
                    System.out.print("*");
                }


            }
            System.out.println();
        }
    }
}
