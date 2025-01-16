package Day2;

public class AquaticaCarnival {
    public void grade(int hrl,int speed,int spin){
        boolean a1 = false,a2=false,a3=false;
        if(hrl>50)
        {
            a1=true;
        }
        if(speed>60)
        {
            a2=true;
        }
        if(spin>100)
        {
            a3=true;
        }
        if(a1&&a2&&a3)
        {
            System.out.println("Grade 10");
        }
        else if(a1&&a2)
        {
            System.out.println("Grade 9");
        } else if (a2&&a3) {
            System.out.println("Grade 8");
        } else if (a1&&a3) {
            System.out.println("Grade 7");
        } else if (a1||a2||a3) {
            System.out.println("Grade 6");
        }
        else {
            System.out.println("Grade 5");
        }

    }
}
