package Day19_OOPs;

public class BMI {
    private double weight;
    private double height;
    private double bmi;
    private String grade;

    BMI(double weight,double height)
    {
        this.weight = weight;
        this.height = height;
    }
    public double BMICalculator()
    {
        double weight = this.weight;
        double height = this.height;
        bmi = weight/(height*height);
        return bmi;
    }
    public String CalculateGrade()
    {
        double bmi = BMICalculator();
        String ans;
        if(bmi<18.5)
        {
            ans = "U";
        } else if (bmi>=18.5&&bmi<25.0) {
            ans = "N";
        } else if (bmi>=25.0 && bmi<30.0) {
            ans = "H";
        }
        else {
            ans = "O";
        }
        grade = ans;
        return grade;
    }

    public void displayBMI()
    {
        System.out.println(CalculateGrade());
    }
}
