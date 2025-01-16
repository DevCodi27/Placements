package Day7;

public class WashingMachine {
    public static void time(int weight)
    {
        if(weight>0&&weight<=2000)
        {
            System.out.println("Time Estimated: 25 minutes");
        }
        else if(weight>=2001&&weight<=4000)
        {
            System.out.println("Time Estimated: 35 minutes");
        }
        else if(weight>=4001&&weight<=7000) {
            System.out.println("Time Estimated: 45 minutes");
        }
        else if (weight>=7000)
        {
            System.out.println("OVERLOADED");
        }
        else {
            System.out.println("INVALID INPUT");
        }
    }
}
