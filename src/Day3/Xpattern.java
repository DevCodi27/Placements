package Day3;

public class Xpattern {
    public void ptn(String str)
    {
        int n = str.length();
        int i = 0;
        while(i<n)
        {
            int j = 0;
            int k = n-1-i;
            while(j<n)
            {
                if(j==i||j==k)
                {
                    System.out.print(str.charAt(j));
                }
                else {

                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
