package Day3;

public class Plusptn {
    public void ptn(int n)
    {
        int l = n*2-1;
        int i = 1;
        int j = 1;

       while(i<=l)
       {
           j=1;
           while(j<=l)
           {
               if(j==(l+1)/2)
               {
                   System.out.print("*");
               }
               else
               {
                   if(i==(l+1)/2)
                   {
                       System.out.print("*");
                   }
                   else {
                       System.out.print(" ");
                   }

               }
              j++;
           }
           System.out.println();

           i++;
       }
    }
}
