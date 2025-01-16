package Day3;

public class KaprekarNum {
    public void kaprekar(int n)
    {
        int square = n*n;
        int ans=0;
        String str = String.valueOf(square);
        String str2 = "";
        String str3 = "";
        int a1=0,a2=0;
        int len = str.length();

        for(int i = 0;i<len;i++)
        {

            if(i<len/2)
            {
                 str2+=str.charAt(i);

            }
            else
            {
                str3+=str.charAt(i);

            }
        }
        a2=Integer.parseInt(str3);
        a1=Integer.parseInt(str2);
        ans = a1+a2;

        if(ans == n)
        {
            System.out.println("Kapreka Number");
        }else
        {
            System.out.println("Not a Kepreka Number");
        }


    }
}
