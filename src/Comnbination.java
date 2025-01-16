public class Comnbination {

    public int combination(int m,int  w){
        int totalPeople = m+w;
        int totalPeopleCombination = nCr(totalPeople,3);
        int mensCombination = m>=3? nCr(m,3):0;
        int womensCombinations = w>3? nCr(w,3):0;

        return totalPeopleCombination - mensCombination - womensCombinations;
    }

    public int nCr(int n,int r)
    {
       if(r>n)
       {
           return 0;
       }
       long result = 1;
       for(int i  = 1;i<=r;i++)
       {
           result = result*(n-i+1)/i;
       }
       return (int) result;
   }
}
