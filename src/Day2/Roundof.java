package Day2;

public class Roundof {
    public void roubd(int n)
    {
        int ans = 0;
        int ans1;
        if(n<33)
        {
            System.out.println(n);
        }
        else {
           ans = n+2;
           ans1 = n+1;
           if(ans%5==0)
           {
               System.out.println(ans);
           } else if (ans1%5==0) {
               System.out.println(ans1);

           } else {
               System.out.println(n);
           }
        }

    }
}
