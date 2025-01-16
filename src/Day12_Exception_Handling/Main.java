package Day12_Exception_Handling;

import java.util.Scanner;

import static Day12_Exception_Handling.ArrayOutofBound.arr;
import static Day12_Exception_Handling.DiveZero.zero;
import static Day12_Exception_Handling.DotCount.dc;
import static Day12_Exception_Handling.EmailValidation.validation;
import static Day12_Exception_Handling.MisMatch.mismatch;
import static Day12_Exception_Handling.NFE.nfe;
import static Day12_Exception_Handling.Null.empty;
import static Day12_Exception_Handling.ReVoewl.rv;
import static Day12_Exception_Handling.RegMobile.removalidate;
import static Day12_Exception_Handling.Split.splitString;
import static Day12_Exception_Handling.VowelCount.vc;
import static Day12_Exception_Handling.VowelReplace.vr;

public class Main {
    public  static void main(String[] args) throws DomainException, DotException, AtTheRateException, NumberFormatException, IllegalArgumentException, NoSuchElementException {

//       splitString();
//        zero();
//        empty();
//        mismatch();
//        validation();
//        removalidate();
//        arr();
        nfe();
//        vc();
//        rv();
//        vr();
//        dc();
    }
}
