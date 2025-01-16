package Day2;

public class Zodiac {
    public void zose(int d,int m)
    {
        switch (m)
        {
            case(1):
            {
             if(d>0 && d<20)
             {
                 System.out.println("Capnicom");
             }
             else if(d>=20 && d<=31)
             {
                 System.out.println("Aquanius");
             }
             break;

            }
            case(2):
            {
                if(d>0 && d<18)
                {
                    System.out.println("Aquanius");
                }
                else if(d>=19 && d<=28)
                {
                    System.out.println("Pisces");
                }
                break;
            }
            case (3):
            {
                if(d>0 && d<=20)
                {
                    System.out.println("Pisces");
                }
                else if(d>20 && d<=31)
                {
                    System.out.println("Aries");
                }
                break;
            }
            case (4):
            {
                if(d>0 && d<20)
                {
                    System.out.println("Aries");
                }
                else if(d>=20 && d<=30)
                {
                    System.out.println("Taurus");
                }
                break;
            }
            case (5):
            {
                if(d>0 && d<=20)
                {
                    System.out.println("Taurus");
                }
                else if(d>20 && d<=31)
                {
                    System.out.println("Gemini");
                }
                break;
            }
            case (6):
            {
                if(d>0 && d<=20)
                {
                    System.out.println("Gemini");
                }
                else if(d>20 && d<=30)
                {
                    System.out.println("Cancer");
                }
                break;
            }
            case (7):
            {
                if(d>0 && d<=22)
                {
                    System.out.println("Cancer");
                }
                else if(d>22 && d<=31)
                {
                    System.out.println("Leo");
                }
                break;
            }
            case (8):
            {
                if(d>0 && d<=22)
                {
                    System.out.println("Leo");
                }
                else if(d>22 && d<=31)
                {
                    System.out.println("Virgo");
                }
                break;
            }
            case (9):
            {
                if(d>0 && d<=22)
                {
                    System.out.println("Virgo");
                }
                else if(d>22 && d<=30)
                {
                    System.out.println("Libra");
                }
                break;
            }
            case (10):
            {
                if(d>0 && d<=22)
                {
                    System.out.println("Libra");
                }
                else if(d>22 && d<=31)
                {
                    System.out.println("Scorpio");
                }
                break;
            }
            case (11):
            {
                if(d>0 && d<=21)
                {
                    System.out.println("Scorpio");
                }
                else if(d>21 && d<=30)
                {
                    System.out.println("Sagttanius");
                }
                break;
            }
            case (12):
            {
                if(d>0 && d<=21)
                {
                    System.out.println("Sagttanius");
                }
                else if(d>21 && d<=31)
                {
                    System.out.println("Capnicom");
                }
                break;
            }
        }
    }
}
