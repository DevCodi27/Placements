package Day2;

public class HangingBridge {
    public void legcount(int a,int c,int l)
    {
        int ans = a*2+c*2;
        if(l == ans)
        {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
