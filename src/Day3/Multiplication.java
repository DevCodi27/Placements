package Day3;

public class Multiplication {
    public void mulpth(int n){
        int i = 1;
         int cnt = 0;
        while(i<=(n+1)/2)
        {
            int j = 1;
            while(j<i+1)
            {
                System.out.print(i*j+" ");
                j++;
            }
            System.out.println();
            i++;
            cnt = i;

        }

        int k=1;
        while(cnt<=n)
        {
            int j = 1;
            while(j<=n-cnt+1)
            {
                System.out.print(cnt*j+" ");
                j++;
            }
            System.out.println();
            cnt++;
        }
    }
}
