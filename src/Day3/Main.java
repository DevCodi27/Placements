package Day3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       OddSeries oddSeries = new OddSeries();
       oddSeries.serve(10);
        AddFive addFive = new AddFive();
        addFive.series(6);
        Squareseries squareseries = new Squareseries();
        squareseries.series(6);
        KaprekarNum kaprekarNum = new KaprekarNum();
        kaprekarNum.kaprekar(297);
        TrendyNumber trendyNumber = new TrendyNumber();
        int trend = sc.nextInt();
        trendyNumber.trendy(trend);
        Pattern pattern = new Pattern();
        int num = sc.nextInt();
        pattern.ptn(num);
          SpecialNumber specialNumber= new SpecialNumber();
          specialNumber.special(9);
        Nnum nnum = new Nnum();
        nnum.count(15);
        TargetAcheive targetAcheive = new TargetAcheive();
        int target = sc.nextInt();
        int point_1 = sc.nextInt();
        int point_2 = sc.nextInt();
        int point_3 = sc.nextInt();
        targetAcheive.acheive(target,point_1,point_2,point_3);
        BitPattern bitPattern = new BitPattern();
        int num1 = sc.nextInt();
        bitPattern.ptn(num1);
        Plusptn plusptn = new Plusptn();
        plusptn.ptn(5);
        Multiplication multiplication = new Multiplication();
        int n = sc.nextInt();
        multiplication.mulpth(n);
        Xpattern xpattern = new Xpattern();
        xpattern.ptn("birds");
        HollowPyramid hollowPyramid =new HollowPyramid();
        hollowPyramid.pyramind(6);

    }
}
