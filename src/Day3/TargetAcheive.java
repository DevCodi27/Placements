package Day3;

public class TargetAcheive {
    public void acheive(int target,int point_1,int point_2,int point_3)
    {
        if(point_1>=target)
        {
            System.out.println("Turn 1");
        } else if (point_1+point_2>=target) {
            System.out.println("Turn 2");
        }
        else if(point_1+point_2+point_3>=target)
        {
            System.out.println("Turn 3");
        }
        else {
            System.out.println("Can't Acheive");
        }
    }
}
