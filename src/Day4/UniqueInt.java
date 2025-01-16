package Day4;

public class UniqueInt {
    public void unique(int f,int l){
        for(int i =  f;i<l;i++)
        {
            if(i%11==0||i%100==0) {
                continue;
            }
            if(i>100)
            {
                int temp;
                int rem;
                rem = i%10;
                temp = i/100;
                if(temp==rem)
                {
                    continue;
                }
                int  two = i/10;
                int mid = two%10;
                if(mid==rem)
                {
                    continue;
                }
                else if(mid == temp)
                {
                    continue;
                }


            }
            System.out.print(i+" ");
        }
    }
}
