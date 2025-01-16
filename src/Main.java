import Day2.*;
import Day3.OddSeries;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

      LeapYear leapYear = new LeapYear();
      leapYear.year(1900);

        BunjeeJumping bunjeeJumping = new BunjeeJumping();
        bunjeeJumping.jump(12,111);

        HangingBridge hangingBridge = new HangingBridge();
        hangingBridge.legcount(52,80,264);
        Roundof roundof = new Roundof();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0;i<5;i++)
        {
            int num = sc.nextInt();
            roundof.roubd(num);
        }

        Temperature temperature = new Temperature();
        temperature.temp(25);

        Zodiac zodiac = new Zodiac();
        zodiac.zose(7,8);

        MagicTicket magicTicket = new MagicTicket();
        String str = sc.nextLine();
        magicTicket.ticket(str);

        AquaticaCarnival aquaticaCarnival = new AquaticaCarnival();
        aquaticaCarnival.grade(55,64,102);


    }
}
