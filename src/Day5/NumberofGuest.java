package Day5;

public class NumberofGuest {
    public void guest(int[] enter,int[] exit)
    {
        int n = enter.length;
        int[] people = new int[n];
        int sum = 0;
         for(int i= 0;i<n;i++)
        {
            sum= sum+enter[i]-exit[i];
            people[i]=sum;
        }
        int max = 0;
         for(int c:people)
         {
             max = Math.max(max,c);
         }

        System.out.println(max);
    }
}
