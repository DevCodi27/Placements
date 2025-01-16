package Day14_Online_Class;

import static Day14_Online_Class.AddOne.addone;
import static Day14_Online_Class.Buystocks.stocks;
import static Day14_Online_Class.ElementNotMatch.nm;
import static Day14_Online_Class.Rotation.rotation;
import static Day14_Online_Class.SingleDigit.sd;
import static Day14_Online_Class.Wavesort.sort;

public class Main {
    public static void main(String [] args)
    {
        rotation();
        sort();
        addone();
        stocks();
        sd();
        nm();
    }
}
