package Day11_Regular_Expressions;

import static Day11_Regular_Expressions.AlphaNumunder.underscore;
import static Day11_Regular_Expressions.CamelCase.camelcase;
import static Day11_Regular_Expressions.CheckAlphaNum.alphanum;
import static Day11_Regular_Expressions.DuckNumber.duckNo;
import static Day11_Regular_Expressions.EndNum.num;
import static Day11_Regular_Expressions.Findot.dot;
import static Day11_Regular_Expressions.GPattern.validateg;
import static Day11_Regular_Expressions.ISNnumber.isn;
import static Day11_Regular_Expressions.LeadingZero.remove;
import static Day11_Regular_Expressions.LuckyNumber.lucky_number;
import static Day11_Regular_Expressions.Qoccuracence.qpre;
import static Day11_Regular_Expressions.StartwithFive.five;
import static Day11_Regular_Expressions.SumOFBinary.binary;
import static Day11_Regular_Expressions.VowelConsent.vcletter;

public class Main {
    public static void main(String[] args)
    {
        validateg();
        remove();
        dot();
        alphanum();
        qpre();
        num();
        vcletter();
        camelcase();
        underscore();
        five();
        binary();
        duckNo();
        isn();

        lucky_number();
    }
}
