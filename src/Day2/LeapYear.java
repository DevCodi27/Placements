package Day2;

public class LeapYear {
    public void year(int year)
    {
        if(year%4==0 && year%100!=0 || year%400==0)
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not a Leap Year");
        }
    }

}
