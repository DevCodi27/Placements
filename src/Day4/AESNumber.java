package Day4;

public class AESNumber {
    public void aes(int l,int n)
    {
        int cnt;
        int cn = 0;
        for(int i = l;i<=n;i++)
        {

            cnt = 0;
            for(int j = 1;j<=i;j++)
            {
                if(i%j==0)
                {
                    cnt++;
                }

            }
            if(cnt==4)
            {
                cn++;
            }
        }
        System.out.println(cn);



    }
}
