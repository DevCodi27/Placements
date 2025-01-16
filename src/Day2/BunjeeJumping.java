package Day2;

public class BunjeeJumping {
    public void jump(int age,int weight)
    {
        if(age>=12)
        {
            if(weight>40 && weight<110)
            {
                System.out.println("He can Jump");
            }
            else if(weight>=110) {
                System.out.println("Extra rope need to add");
            }
            else {
                System.out.println("Not eligible to Jump");
            }
        }
        else{
            System.out.println("Not eligible to Jump");
        }
    }
}
