package Day7;

public class Candies {
  public void candiee(int s)
  {
    int n = 10;
    int k = 5;
    if(s>n || s<=0)
    {
      System.out.println("Invalid Input");
    }
    else if(n-s>k)
    {
      n-=s;
      System.out.println("Remainig Candies "+n);
    }
    else if(n-s<k)
    {
      System.out.println("Can't Distribute Evenly");
    }
    else {
      n-=s;
      System.out.println("Candies Distributed Evenly "+n/k);
    }
  }
}
